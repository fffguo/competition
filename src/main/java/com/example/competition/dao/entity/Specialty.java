package com.example.competition.dao.entity;

import java.util.Date;

public class Specialty {
    private Integer specialtyId;

    private String specialtyName;

    private Integer departmentId;

    private Integer specialtyStatus;

    private Date createTime;

    private Date updateTime;

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName == null ? null : specialtyName.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getSpecialtyStatus() {
        return specialtyStatus;
    }

    public void setSpecialtyStatus(Integer specialtyStatus) {
        this.specialtyStatus = specialtyStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}