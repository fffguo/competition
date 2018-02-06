package com.example.competition.utils;

import com.example.competition.dao.entity.User;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.impl.AccountServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * shiro通用工具类
 *
 * @作者：刘富国
 * @创建时间：2018/1/24 11:27
 */
public class ShiroUtil {
    /**
     * 对密码进行加密
     */
    public static String encodePassword(String username, String password,String salt) {
        return new Md5Hash(username + password, salt, 2).toBase64();
    }

    /**
     * 获取UsernamePasswordToken
     */
    public static UsernamePasswordToken getToken(String username, String password,String salt, boolean rememberMe) {
        return new UsernamePasswordToken(username, encodePassword(username, password,salt), rememberMe);
    }

    /**
     * 生成随机盐
     */
    public static String randomPasswordSalt(){
        return new SecureRandomNumberGenerator().nextBytes().toHex();
    }
}
