package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:26
 */
@Getter
public enum RoleIdEnum {
    ROOT(1, "root"),
    STUDENT(2, "student"),
    ;
    private Integer code;
    private String message;

    RoleIdEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
