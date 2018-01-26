package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @作者：刘富国
 * @创建时间：2018/1/26 9:46
 */
@Data
@Entity
@DynamicUpdate
public class Role {
    @Id
    @GeneratedValue
    private Integer roleId;

    private String roleName;

    private Integer roleStatus;

    private Date createTime;

    private Date updateTime;

}
