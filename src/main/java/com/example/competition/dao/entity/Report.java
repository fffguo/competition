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
public class Report {
    @Id
    @GeneratedValue
    private Integer reportId;

    private Integer reportStatus;

    private String mainStudentNo;

    private String mainStudentName;

    private String mainStudentSpecialty;

    private String mainStudentPhone;

    private String mainStudentEmail;

    private String mainStudentDepartment;

    private String mainStudentGrade;

    private String mainStudentQq;

    private String oneStudentNo;

    private String oneStudentName;

    private String oneStudentSpecialty;

    private String oneStudentPhone;

    private String oneStudentEmail;

    private String oneStudentDepartment;

    private String oneStudentGrade;

    private String oneStudentQq;

    private String twoStudentNo;

    private String twoStudentName;

    private String twoStudentSpecialty;

    private String twoStudentPhone;

    private String twoStudentEmail;

    private String twoStudentDepartment;

    private String twoStudentGrade;

    private String twoStudentQq;

    private String teacherName;

    private String teacherPhone;

    private String teacherEmail;

    private String teacherDepartment;

    private String teacherQq;

    private String worksNo;

    private String worksName;

    private Date createTime;

    private Date updateTime;
}