package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/2/6 17:13
 */
@Getter
public enum  UserRoleRelStatusEnum {
    BIND(1, "绑定"),
    UNBIND(0, "解绑"),
            ;
    private Integer code;
    private String message;

    UserRoleRelStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
