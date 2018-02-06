package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @作者：刘富国
 * @创建时间：2018/2/6 14:45
 */
@Data
@Entity
@DynamicUpdate
public class UserDetail {

    @Id
    @GeneratedValue
    private Integer id;

    private String studentNo;

    private String name;

    private Integer reportId;

    private String studentSpecialty;

    private String department;

    private String studentGrade;

    private Integer status;

    private String phone;

    private String email;

    private String qq;

    private String icon;

    private Date createTime;

    private Date updateTime;

}
