package com.example.competition.service.impl;

import com.example.competition.dao.entity.User;
import com.example.competition.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
//        Account result=accountService.updatePassword("595726017@qq.com","456");
//        Assert.assertNotNull(result);
    }




    @Test
    public void findOne(){
        User user=new User();
//        user.setId(new Long(1));
        user.setUsername("root");
//        user.setStatus(0);
        System.out.println(accountService.findOne(user).toString());
    }
}