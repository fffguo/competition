package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 10:27
 */
@Getter
public enum ResultVOEnum {
    SUCCESS(1, "成功"),
    ERROR(0,"失败"),
    ;
    private Integer code;
    private String message;

    ResultVOEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
