package com.example.competition.dao.entity;

import java.util.Date;

public class Group_teacher_rel {
    private Integer groupTeacherRelId;

    private Integer groupId;

    private Integer teacherId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Integer getGroupTeacherRelId() {
        return groupTeacherRelId;
    }

    public void setGroupTeacherRelId(Integer groupTeacherRelId) {
        this.groupTeacherRelId = groupTeacherRelId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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