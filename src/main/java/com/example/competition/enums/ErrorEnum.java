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
    PLEASE_NO_REPEAT(2,"请不要重复操作"),
    INSERT_FAIL(3,"新增失败"),
    UPDATE_FAIL(4,"更新失败"),
    INSERT_OR_UPDATE_FAIL(5,"新增或更新失败"),

    USER_NOT_EXIST(10,"用户不存在"),
    ACCOUNT_UPDATE_FAIL(11,"账号更新失败"),
    ACCOUNT_PASSWORD_ERROR(12,"账号密码错误"),

    REPORT_NOT_EXIST(21,"报名信息不存在"),
    REPORT_UPDATE_FAIL(22,"更新报名信息失败")

//    USERNAME_PASSWORD_NOT_NULL(20,"用户名密码不能为空"),
    ;
    private Integer code;
    private String message;

    ErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
