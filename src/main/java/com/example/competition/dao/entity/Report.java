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

    private String mainStudentNo;

    private String mainStudentName;

    private String mainStudentSpecialty;

    private String mainStudentPhone;

    private String mainStudentEmail;

    private String mainStudentDepartment;

    private String mainStudentGrade;

    private String mainStudentQq;

    private String student1No;

    private String student1Name;

    private String student1Specialty;

    private String student1Phone;

    private String student1Email;

    private String student1Grade;

    private String student1Qq;

    private String student2No;

    private String student2Name;

    private String student2Specialty;

    private String student2Phone;

    private String student2Email;

    private String student2Department;

    private String student2Grade;

    private String student2Qq;

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