package com.example.competition.service.impl;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.entity.Users;
import com.example.competition.dao.repository.AccountRepository;
import com.example.competition.dao.repository.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

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

    @Override
    public Account findOne(Account account) {
        //1.通过id查询
        if(account.getAccountId()!=null){
            return accountRepository.findOne(account.getAccountId());
        }
        //2.通过用户名查询
        if(account.getAccountLoginName()!=null){
            return accountRepository.findByAccountLoginName(account.getAccountLoginName());
        }
        return null;
    }

    @Override
    public Users findOne(Users user) {
        //1.通过id和status查询
        if(!StringUtils.isEmpty(user.getId())&&!StringUtils.isEmpty(user.getStatus())){
            return userRepository.findByIdAndStatus(user.getId(),user.getStatus());
        }
        //2.通过username和status查询
        if(!StringUtils.isEmpty(user.getUsername())&&!StringUtils.isEmpty(user.getStatus())){
            return userRepository.findByUsernameAndStatus(user.getUsername(),user.getStatus());
        }
        //3.通过id查询
        if(user.getId()!=null){
            return userRepository.findOne(user.getId());
        }
        //2.通过用户名查询
        if(user.getUsername()!=null){
            return userRepository.findByUsername(user.getUsername());
        }
        return null;
    }
}
