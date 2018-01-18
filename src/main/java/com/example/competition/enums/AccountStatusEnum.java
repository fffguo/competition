package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 15:12
 */
@Getter
public enum AccountStatusEnum {
    NORMAL(1, "正常"),
    NOT_ACTIVATE(0, "未激活"),
    DELETE(2, "已删除"),
    ;
    private Integer code;
    private String message;

    AccountStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
