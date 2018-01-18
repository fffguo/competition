package com.example.competition.service;

import com.example.competition.dao.entity.Account;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:33
 */
public interface LoginService {

    Account createAccount(String email);
}
