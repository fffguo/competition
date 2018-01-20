package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 16:01
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Account findByAccountLoginName(String accountLoginName);

    Account findByAccountLoginNameAndAccountStatus(String accountLoginName,Integer accountStatus);

    Account findByAccountLoginNameAndAccountPasswordAndAccountStatus(String accountLoginName,String accountPassword,Integer accountStatus);

}
