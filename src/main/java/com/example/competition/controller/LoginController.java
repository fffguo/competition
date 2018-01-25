package com.example.competition.controller;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.entity.Users;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.impl.AccountServiceImpl;
import com.example.competition.utils.ShiroUtil;
import com.example.competition.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.SecureRandom;

/**
 * @作者：刘富国
 * @创建时间：2018/1/19 14:27
 */
@Slf4j
@Controller
public class LoginController {
    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            log.error("【登录】用户名密码不能为空，username={}，password={}",username,password);
            throw new CompetitionException(ErrorEnum.USERNAME_PASSWORD_NOT_NULL);
        }
        Users user=new Users();
        user.setUsername(username);
        user=accountService.findOne(user);
        if(user==null){
            log.error("【登录】账号不存在，username={}",username);
            throw new CompetitionException(ErrorEnum.ACCOUNT_NOT_EXIST);
        }
        String salt=accountService.findOne(user).getPasswordSalt();
        password=new Md5Hash(username+password,salt,2).toBase64();
        System.out.println(password);
        ShiroUtil.login(username,password);
        System.out.println(ShiroUtil.getSubject().isAuthenticated());
        return "redirect:/index.html";
    }



}
