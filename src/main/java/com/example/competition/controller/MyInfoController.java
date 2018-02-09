package com.example.competition.controller;

import com.example.competition.dao.entity.Report;
import com.example.competition.dao.entity.User;
import com.example.competition.dao.entity.UserDetail;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.AccountService;
import com.example.competition.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @作者：刘富国
 * @创建时间：2018/2/5 16:55
 */
@Slf4j
@Controller
@RequestMapping("/myInfo")
public class MyInfoController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private ReportService reportService;

    @GetMapping("/base")
    public String base(ModelMap modelMap) {
        modelMap.put("myBaseInfo", "active-menu");
        modelMap.put("myInfoUlClass", "collapse in");
        modelMap.put("myInfoClass", "waves-effect waves-dark active-menu");
        User user= (User) SecurityUtils.getSubject().getSession().getAttribute("user");
        if(user==null){
            log.error("【获取用户基本信息】用户不存在");
            throw new CompetitionException(ErrorEnum.USER_NOT_EXIST);
        }
        UserDetail userDetail=new UserDetail();
        userDetail.setId(user.getDetailId());
        userDetail=accountService.findOne(userDetail);
        if(userDetail==null)
            userDetail=new UserDetail();
        modelMap.put("detail",userDetail);
        return "/myInfo/base-info";
    }

    @GetMapping("/report")
    public String report(ModelMap modelMap){
        modelMap.put("reportInfo", "active-menu");
        modelMap.put("myInfoUlClass", "collapse in");
        modelMap.put("myInfoClass", "waves-effect waves-dark active-menu");
        User user= (User) SecurityUtils.getSubject().getSession().getAttribute("user");
        if(user==null){
            log.error("【获取用户报名信息】用户不存在");
            throw new CompetitionException(ErrorEnum.USER_NOT_EXIST);
        }
        UserDetail userDetail=new UserDetail();
        userDetail.setId(user.getDetailId());
        userDetail=accountService.findOne(userDetail);
        if(userDetail==null){
            log.error("【获取用户报名信息】用户详情不存在，userDetailId={}",user.getDetailId());
            throw new CompetitionException(ErrorEnum.USER_DETAIL_NOT_EXIST);
        }
        Report report=reportService.findOne(userDetail.getReportId());
        if(report==null){
            log.error("【获取用户报名信息】报名表不存在,reportId={}",userDetail.getReportId());
            throw new CompetitionException(ErrorEnum.USER_DETAIL_NOT_EXIST);
        }
        modelMap.put("report",report);
        return "/myInfo/report-info";
    }

    @GetMapping("/submit")
    public String submit(ModelMap modelMap){
        modelMap.put("submitInfo", "active-menu");
        modelMap.put("myInfoUlClass", "collapse in");
        modelMap.put("myInfoClass", "waves-effect waves-dark active-menu");
        return "/myInfo/submit-info";
    }

    @PostMapping("/upload")
    public String upload(ModelMap modelMap){
        return "";
    }
}
