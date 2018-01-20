package com.example.competition.enums;

import lombok.Data;
import lombok.Getter;

/**
 * 错误码 枚举类
 * @作者：刘富国
 * @创建时间：2018/1/18 10:19
 */
@Getter
public enum ErrorEnum {
    PARAM_ERROR(1,"参数不正确"),

    ACCOUNT_NOT_EXIST(10,"账号不存在"),
    ACCOUNT_UPDATE_FAIL(11,"账号更新失败"),
    ACCOUNT_PASSWORD_ERROR(12,"账号密码错误"),
    ;
    private Integer code;
    private String message;

    ErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
