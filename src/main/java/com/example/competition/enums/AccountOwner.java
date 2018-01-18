package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:16
 */
@Getter
public enum AccountOwner {
    STUDENT(0, "学生"),
    TEACHER(1, "教师"),
    ;
    private Integer code;
    private String message;

    AccountOwner(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
