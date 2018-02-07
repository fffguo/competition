package com.example.competition.controller;

import com.example.competition.dao.entity.User;
import com.example.competition.dao.entity.UserDetail;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "myBaseInfo";
    }
}
