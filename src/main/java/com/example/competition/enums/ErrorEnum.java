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
    ;
    private Integer code;
    private String msg;

    ErrorEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
