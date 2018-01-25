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
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.SecureRandom;
import java.util.HashMap;
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

    /** 登录 */
    @PostMapping("/login")
    public String login(HttpServletRequest request){
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
        Subject subject=ShiroUtil.login(username,password);
        request.getSession().setAttribute("user",subject.getSession());
        return "redirect:/index.html";
    }

    /** 是否已经登录*/
    @GetMapping("/isAuthenticated")
    @ResponseBody
    public boolean isAuthenticated(HttpServletRequest request){
        return request.getSession().getAttribute("user")==null?false:true;
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
    }

    @RequestMapping("test")
    public String test(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/test";
    }
}
