package com.example.competition.dao.entity;

import com.example.competition.enums.UserEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @作者：刘富国
 * @创建时间：2018/1/24 16:51
 */
@Data
@Entity
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue
    private Long userId;

    private Integer userStatus;

    private String username;

    private String password;

    private String passwordSalt;

    private Date createTime;

    private Date updateTime;
}
