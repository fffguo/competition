package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @作者：刘富国
 * @创建时间：2018/1/26 9:47
 */
@Data
@Entity
@DynamicUpdate
public class Permission {
    @Id
    @GeneratedValue
    private Integer pId;

    private String pName;

    private Integer pStatus;

    private Date createTime;

    private Date updateTime;

}
