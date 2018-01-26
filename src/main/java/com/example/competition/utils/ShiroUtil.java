package com.example.competition.utils;

import com.example.competition.dao.entity.User;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.impl.AccountServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * shiro通用工具类
 *
 * @作者：刘富国
 * @创建时间：2018/1/24 11:27
 */
@Slf4j
@Component
public class ShiroUtil {

    @Autowired
    private AccountServiceImpl accountService;

    /**
     * 对密码进行加密
     */
    public String encodePassword(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setUserStatus(1);
        user = accountService.findOne(user);
        if (user == null) {
            log.error("【登录】账号不存在，username={}", username);
            throw new CompetitionException(ErrorEnum.ACCOUNT_NOT_EXIST);
        }
        password = new Md5Hash(username + password, user.getPasswordSalt(), 2).toBase64();
        return password;
    }

    /**
     * 获取UsernamePasswordToken
     */
    public UsernamePasswordToken getToken(String username, String password, boolean rememberMe) {
        return new UsernamePasswordToken(username, encodePassword(username, password), rememberMe);
    }
}
