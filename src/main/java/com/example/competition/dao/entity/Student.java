package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@DynamicUpdate
public class Student {
    @Id
    @GeneratedValue
    private Integer studentId;

    private String studentNo;

    private String studentName;

    private Integer groupId;

    private Integer studentSpecialtyId;

    private Integer studentGrade;

    private Integer studentStatus;

    private String studentPhone;

    private String studentEmail;

    private String studentQq;

    private Date createTime;

    private Date updateTime;

}