package com.example.competition.dao.model;

import lombok.Data;

import java.util.Date;
@Data
public class Users {
    private Integer id;

    private Integer status;

    private String username;

    private String password;

    private String passwordSalt;

    private Date createTime;

    private Date updateTime;
}