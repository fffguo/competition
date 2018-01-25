package com.example.competition.utils;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.CodecSupport;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Test
    public void getSubject() {
        ShiroUtil.login("41511","123",true);
        ShiroUtil.getSubject().logout();
        System.out.println(ShiroUtil.getSubject().isAuthenticated());
    }

    @Test
    public void testRole(){
        ShiroUtil.login("root","123");
        System.out.println(ShiroUtil.getSubject().hasRole("role1"));
        System.out.println(ShiroUtil.getSubject().isPermitted("system:user:5,4"));
//        new Md5Hash("123","465",2);
    }
}