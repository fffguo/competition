package com.example.competition.controller;

import com.example.competition.service.impl.AccountServiceImpl;
import com.example.competition.utils.ShiroUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者：刘富国
 * @创建时间：2018/1/19 14:27
 */
@Slf4j
@Controller
public class LoginController {
    @Autowired
    private AccountServiceImpl accountService;
    @Autowired
    private ShiroUtil shiroUtil;
    /**
     * 登录
     */
    @PostMapping("/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        @RequestParam(value = "rememberMe", defaultValue = "false") boolean rememberMe) {
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(shiroUtil.getToken(username,password,rememberMe));
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        return "redirect:/index.html";
    }



    @GetMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:/index.html";
    }


}
