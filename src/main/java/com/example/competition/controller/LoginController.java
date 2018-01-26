package com.example.competition.controller;

import com.example.competition.dao.entity.User;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.impl.AccountServiceImpl;
import com.example.competition.utils.ShiroUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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

    /**
     * 是否已经登录
     */
    @GetMapping("/isAuthenticated")
    @ResponseBody
    public boolean isAuthenticated(HttpServletRequest request) {
        return request.getSession().getAttribute("user") == null ? false : true;
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
    }

    @RequestMapping("index.html")
    public String test(Map<String, Object> map) {
//        Subject subject = SecurityUtils.getSubject();
//        try {
//            subject.login(shiroUtil.getToken("root","123456",true));
//        } catch (AuthenticationException e) {
//            e.printStackTrace();
//        }
        map.put("hello", "from TemplateController.helloHtml");
        return "/index.html";
    }
}
