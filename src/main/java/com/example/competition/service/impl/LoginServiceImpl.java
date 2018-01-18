package com.example.competition.service.impl;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.repository.AccountRepository;
import com.example.competition.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:34
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(String email) {
        Account account=new Account();
        account.setAccountLoginName(email);
        account.setAccountPassword("123456");
        return accountRepository.save(account);
    }
}
