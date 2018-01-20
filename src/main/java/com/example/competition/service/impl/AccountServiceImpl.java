package com.example.competition.service.impl;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.repository.AccountRepository;
import com.example.competition.enums.AccountStatusEnum;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.exception.CompetitionException;
import com.example.competition.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.transaction.Transactional;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 19:02
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public Account updatePassword(String loginName,String password) {
        Account account=accountRepository.findByAccountLoginName(loginName);
        if(account==null){
            log.error("【更新密码】账号不存在，loginName={}",loginName);
            throw new CompetitionException(ErrorEnum.ACCOUNT_NOT_EXIST);
        }
        account.setAccountPassword(password);
        account=accountRepository.save(account);
        if(account==null){
            log.error("【更新密码】更新密码失败，loginName={}",loginName);
            throw new CompetitionException(ErrorEnum.ACCOUNT_UPDATE_FAIL);
        }
        return account;
    }

    @Override
    public Account verifyAccount(Account account) {
        //1.验证登录名是否有重复
        Account result=new Account();
        if((!StringUtils.isEmpty(account.getAccountLoginName()))&&StringUtils.isEmpty(account.getAccountPassword())){
            result=accountRepository.findByAccountLoginNameAndAccountStatus(account.getAccountLoginName(), AccountStatusEnum.NORMAL.getCode());
        }
        //2.验证登录名密码是否正确
        if(!StringUtils.isEmpty(account.getAccountLoginName())&&!StringUtils.isEmpty(account.getAccountPassword())){
            result=accountRepository.findByAccountLoginNameAndAccountPasswordAndAccountStatus(account.getAccountLoginName(),account.getAccountPassword(),AccountStatusEnum.NORMAL.getCode());
        }
        return result;
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}
