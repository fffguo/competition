package com.example.competition.service;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.entity.User;
import org.springframework.stereotype.Service;

/**
 * 账号服务
 * @作者：刘富国
 * @创建时间：2018/1/18 18:53
 */

public interface AccountService {
    /** 更新密码 */
    Account updatePassword(String loginName,String password);

    /** 验证账号信息 */
    Account verifyAccount(Account account);

    /** 创建账号 */
    Account createAccount(Account account);

    /** 查询账号信息 */
    Account findOne(Account account);

    /** 查询查询用户信息 */
    User findOne(User user);


}
