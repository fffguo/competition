package com.example.competition.enums;

import lombok.Getter;

/**
 * @作者：刘富国
 * @创建时间：2018/1/30 11:03
 */
@Getter
public enum ReportStatusEnum {
    WAIT_CHECK(0, "待审核"),
    PASS(1, "已通过"),
    NOT_PASS(2, "未通过"),
    ;
    private Integer code;
    private String message;

    ReportStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
