package com.example.competition.utils;

import com.example.competition.dao.entity.User;
import com.example.competition.service.AccountService;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.CodecSupport;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.junit.Assert.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/24 12:26
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShiroUtilTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void encodePassword(){
        User user = new User();
        user.setUsername("root");
        user = accountService.findOne(user);
        System.out.println(user.toString());


        System.out.println(user.getPasswordSalt());
//        password = new Md5Hash(username + password, null, 2).toBase64();
//        return password;
    }
}