package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:21
 */
@Getter
public enum GroupTeacherRelStatusEnum {
    UNBIND(0, "解绑"),
    BINDING(1, "绑定"),
    ;
    private Integer code;
    private String message;

    GroupTeacherRelStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
