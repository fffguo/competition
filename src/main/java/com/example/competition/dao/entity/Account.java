package com.example.competition.dao.entity;

import com.example.competition.enums.AccountOwner;
import com.example.competition.enums.AccountStatusEnum;
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

    private Integer accountStatus = AccountStatusEnum.NOT_ACTIVATE.getCode();

    private Integer accountOwner = AccountOwner.STUDENT.getCode();

    private Integer accountOwnerId;

    private Date createTime;

    private Date updateTime;

}