package com.example.competition.service;

import com.example.competition.dao.entity.Account;
import com.example.competition.dao.entity.User;
import com.example.competition.dao.entity.UserDetail;
import org.springframework.stereotype.Service;

/**
 * 账号服务
 * @作者：刘富国
 * @创建时间：2018/1/18 18:53
 */

public interface AccountService {

    /** 查询用户详细信息 */
    UserDetail findOne(UserDetail userDetail);

    /** 查询查询用户信息 */
    User findOne(User user);

    /** 创建用户 */
    User createUser(Integer reportId);

    /** 删除账户 */
    User delUser(Integer reportId);


}
