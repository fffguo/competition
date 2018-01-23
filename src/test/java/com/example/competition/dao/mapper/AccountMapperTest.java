package com.example.competition.dao.mapper;

import com.example.competition.dao.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/23 11:17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountMapperTest {
    @Test
    public void insert() {
        Account account=new Account();
        account.setAccountLoginName("123");
        account.setAccountPassword("456");
//        int a=accountMapper.insert(account);
//        System.out.println(a);
    }
}