package com.example.competition.enums;

import lombok.Getter;

/**
 * 验证码状态 枚举类
 * @作者：刘富国
 * @创建时间：2018/1/18 15:07
 */
@Getter
public enum VerifyCodeStatusEnum {
    CODE_VALID(1, "验证码有效"),
    CODE_LOSE(0, "验证码失效"),
    ;
    private Integer code;
    private String message;

    VerifyCodeStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
