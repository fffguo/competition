package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:26
 */
@Getter
public enum TeacherStatusEnum {
    STOP(0, "禁用"),
    NORMAL(1, "正常"),
    DELETE(2, "删除"),
    ;
    private Integer code;
    private String message;

    TeacherStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
