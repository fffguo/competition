package com.example.competition.service;

import com.example.competition.dao.entity.Account;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 18:53
 */
public interface AccountService {

    Account updatePassword(String loginName,String password);
}
