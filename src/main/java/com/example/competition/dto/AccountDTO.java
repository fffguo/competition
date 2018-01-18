package com.example.competition.dto;

import com.example.competition.dao.entity.Teacher;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:37
 */
@Data
public class AccountDTO {

    private Integer studentId;

    private String studentNo;

    private String studentName;

    private Integer groupId;

    private Integer studentSpecialtyId;

    private Integer studentGrade;

    private Integer studentStatus;

    private Date createTime;

    private Date updateTime;

    private List<Teacher> teachers;
}
