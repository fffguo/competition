package com.example.competition.service.impl;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.entity.Users;
import com.example.competition.service.AccountService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 19:18
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountServiceImplTest {
    @Autowired
    private AccountService accountService;


    @Test
    public void updatePassword() {
        Account result=accountService.updatePassword("595726017@qq.com","456");
        Assert.assertNotNull(result);
    }
    @Test
    public void findLoginName(){
        Account account=new Account();
        account.setAccountLoginName("595726017@qq.com");
        Account result=accountService.verifyAccount(account);
        Assert.assertNotNull(result);
    }

    @Test
    public void verifyAccount(){
        Account account=new Account();
        account.setAccountLoginName("595726017@qq.com");
        account.setAccountPassword("456");
        Account result=accountService.verifyAccount(account);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne(){
        Users user=new Users();
//        user.setId(new Long(1));
        user.setUsername("root");
//        user.setStatus(0);
        System.out.println(accountService.findOne(user).toString());
    }
}