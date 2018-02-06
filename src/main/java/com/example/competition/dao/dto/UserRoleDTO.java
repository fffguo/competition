package com.example.competition.dao.dto;

import com.example.competition.dao.model.Role;
import com.example.competition.dao.model.User;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @作者：刘富国
 * @创建时间：2018/1/26 10:04
 */
@Data
public class UserRoleDTO{
    private Integer userId;

    private Integer userStatus;

    private String username;

    private String password;

    private String passwordSalt;

    private Integer detailId;

    private Date createTime;

    private Date updateTime;

    private List<Role> roles;
}
