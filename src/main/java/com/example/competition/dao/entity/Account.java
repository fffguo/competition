package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
@DynamicUpdate
public class Account {
    @Id
    @GeneratedValue
    private Integer accountId;

    private String accountLoginName;

    private String accountPassword;

    private Integer accountStatus;

    private Integer accountOwner;

    private Integer accountOwnerId;

    private Date createTime;

    private Date updateTime;
}