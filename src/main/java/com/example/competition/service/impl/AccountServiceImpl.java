package com.example.competition.service.impl;

import com.example.competition.dao.entity.Report;
import com.example.competition.dao.entity.User;
import com.example.competition.dao.entity.UserDetail;
import com.example.competition.dao.entity.User_role_rel;
import com.example.competition.dao.repository.ReportRepository;
import com.example.competition.dao.repository.UserDetailRepository;
import com.example.competition.dao.repository.UserRepository;
import com.example.competition.dao.repository.User_role_relRepository;
import com.example.competition.enums.*;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.AccountService;
import com.example.competition.utils.ShiroUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 19:02
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    private final String defaultPassword="123456";

    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDetailRepository userDetailRepository;
    @Autowired
    private User_role_relRepository user_role_relRepository;

    @Override
    public User findOne(User user) {
        //1.通过id和status查询
        if(!StringUtils.isEmpty(user.getUserId())&&!StringUtils.isEmpty(user.getUserStatus())){
            return userRepository.findByUserIdAndUserStatus(user.getUserId(),user.getUserStatus());
        }
        //2.通过username和status查询
        if(!StringUtils.isEmpty(user.getUsername())&&!StringUtils.isEmpty(user.getUserStatus())){
            return userRepository.findByUsernameAndUserStatus(user.getUsername(),user.getUserStatus());
        }
        //3.通过id查询
        if(user.getUserId()!=null){
            return userRepository.findOne(user.getUserId());
        }
        //2.通过用户名查询
        if(user.getUsername()!=null){
            return userRepository.findByUsername(user.getUsername());
        }
        return null;
    }

    @Override
    public User createUser(Integer reportId) {
        //1.校验reportId
        Report report=reportRepository.findOne(reportId);
        if(report==null){
            log.error("【创建用户】报名表信息不存在，reportId={}",reportId);
            throw new CompetitionException(ErrorEnum.REPORT_NOT_EXIST);
        }
        //2 userDetail，关键点在于id是否存在
        UserDetail userDetail=userDetailRepository.findByReportId(reportId);
        if(userDetail==null) {
            userDetail=new UserDetail();
            log.info("【创建用户】新增userDetail：");
        }
        else
            log.info("【创建用户】更新userDetail：");
        userDetail.setDepartment(report.getMainStudentDepartment());
        userDetail.setEmail(report.getMainStudentEmail());
        userDetail.setName(report.getMainStudentName());
        userDetail.setPhone(report.getMainStudentPhone());
        userDetail.setQq(report.getMainStudentQq());
        userDetail.setReportId(report.getReportId());
        userDetail.setStatus(UserDetailStatusEnum.NORMAL.getCode());
        userDetail.setStudentNo(report.getMainStudentNo());
        userDetail.setStudentGrade(report.getMainStudentGrade());
        userDetail.setStudentSpecialty(report.getMainStudentSpecialty());
        userDetail = userDetailRepository.save(userDetail);
        if (userDetail == null) {
            log.error("【创建用户】新增/更新userDetail失败，reportId={}", reportId);
            throw new CompetitionException(ErrorEnum.INSERT_OR_UPDATE_FAIL);
        }
        //3.user
        User user=userRepository.findByDetailId(userDetail.getId());
        if(user==null){
            user=new User();
            log.info("【创建用户】新增user：");
        }
        else
            log.info("【创建用户】更新user：");
        user.setUsername(report.getMainStudentNo());//用户名为学号
        user.setUserStatus(UserStatusEnum.NEED_RESET_PASSWORD.getCode());//需要重置密码
        String salt=ShiroUtil.randomPasswordSalt();
        user.setPasswordSalt(salt);//生成随机盐
        user.setPassword(ShiroUtil.encodePassword(report.getMainStudentNo(),defaultPassword,salt));//默认密码123456
        user.setDetailId(userDetail.getId());
        user=userRepository.save(user);
        if(user==null){
            log.error("【创建用户】新增/更新user失败，reportId={}",reportId);
            throw new CompetitionException(ErrorEnum.INSERT_OR_UPDATE_FAIL);
        }
        //4.赋予student角色
        User_role_rel user_role_rel=user_role_relRepository.findByUserIdAndRoleId(user.getUserId(), RoleIdEnum.STUDENT.getCode());
        if(user_role_rel!=null){
            user_role_rel.setStatus(UserRoleRelStatusEnum.BIND.getCode());
            user_role_rel=user_role_relRepository.save(user_role_rel);
            if(user_role_rel==null){
                log.error("【创建用户】更新user_role_rel失败，id={}",user_role_rel.getId());
                throw new CompetitionException(ErrorEnum.UPDATE_FAIL);
            }
        }else{
            user_role_rel=new User_role_rel();
            user_role_rel.setStatus(UserRoleRelStatusEnum.BIND.getCode());
            user_role_rel.setRoleId(RoleIdEnum.STUDENT.getCode());
            user_role_rel.setUserId(user.getUserId());
            user_role_rel=user_role_relRepository.save(user_role_rel);
            if (user_role_rel==null){
                log.error("【创建用户】新增user_role_rel失败");
                throw new CompetitionException(ErrorEnum.INSERT_FAIL);
            }
        }
        return user;
    }

    @Override
    public User delUser(Integer reportId) {
        //1.校验reportId
        Report report=reportRepository.findOne(reportId);
        if(report==null){
            log.error("【创建用户】报名表信息不存在，reportId={}",reportId);
            throw new CompetitionException(ErrorEnum.REPORT_NOT_EXIST);
        }
        //2 userDetail，关键点在于id是否存在
        UserDetail userDetail=userDetailRepository.findByReportId(reportId);
        User user=null;
        if(userDetail!=null){
            log.info("【删除用户】更新userDetail：");
            userDetail.setStatus(UserDetailStatusEnum.DELETE.getCode());
            userDetail= userDetailRepository.save(userDetail);
            if (userDetail==null){
                log.error("【删除用户】新增/更新userDetail失败，reportId={}",reportId);
                throw new CompetitionException(ErrorEnum.INSERT_OR_UPDATE_FAIL);
            }
            user = userRepository.findByDetailId(userDetail.getId());
            if(user!=null){
                log.info("【删除用户】更新user：");
                user.setUserStatus(UserStatusEnum.DELETE.getCode());
                user= userRepository.save(user);
                if (user==null){
                    log.error("【删除用户】新增/更新user失败，reportId={}",reportId);
                    throw new CompetitionException(ErrorEnum.INSERT_OR_UPDATE_FAIL);
                }
            }
        }
        //3.user_role_rel
        User_role_rel user_role_rel=user_role_relRepository.findByUserIdAndRoleId(user.getUserId(), RoleIdEnum.STUDENT.getCode());
        if(user_role_rel!=null){
            user_role_rel.setStatus(UserRoleRelStatusEnum.UNBIND.getCode());
            user_role_rel=user_role_relRepository.save(user_role_rel);
            if(user_role_rel==null){
                log.error("【创建用户】更新user_role_rel失败，id={}",user_role_rel.getId());
                throw new CompetitionException(ErrorEnum.UPDATE_FAIL);
            }
        }
        return user;
    }
}
