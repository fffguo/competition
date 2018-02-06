package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/26 10:36
 */
@Getter
public enum UserStatusEnum {
    NORMAL(1, "正常"),
    NEED_RESET_PASSWORD(0, "需要重置密码"),
    DELETE(2, "已删除"),
    ;
    private Integer code;
    private String message;

    UserStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
