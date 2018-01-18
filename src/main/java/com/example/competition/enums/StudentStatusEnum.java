package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:25
 */
@Getter
public enum StudentStatusEnum {
    STOP(0, "禁用"),
    NORMAL(1, "正常"),
    DELETE(2, "删除"),
    ;
    private Integer code;
    private String message;

    StudentStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
