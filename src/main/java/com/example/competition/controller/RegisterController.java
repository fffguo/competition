package com.example.competition.controller;

import com.example.competition.VO.ResultVO;
import com.example.competition.dao.entity.Account;
import com.example.competition.service.AccountService;
import com.example.competition.utils.ResultVOUtil;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/19 14:32
 */
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private AccountService accountService;

    @PostMapping("verify/loginName")
    public ResultVO<Integer> verfityLoginName(@RequestParam("loginName")String loginName){
        Account account=new Account();
        account.setAccountLoginName(loginName);
        Account result=accountService.verifyAccount(account);
        if(result==null)
            return ResultVOUtil.success(1);
        else
            return ResultVOUtil.success(0);
    }
}
