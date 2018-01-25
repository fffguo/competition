package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 16:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountRepositoryTest {

    @Autowired
    private AccountRepository repository;

    @Test
    public void findByAccountLoginName(){
        Account account=repository.findByAccountLoginName("595726017@qq.com");
//        Assert.assertNotNull(account);
    }

}