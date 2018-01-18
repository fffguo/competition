package com.example.competition.VO;

import lombok.Data;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 10:33
 */
@Data
public class ResultVO<T> {
    private Integer code;
    private String message;
    private T data;

    public ResultVO() {
    }

    public ResultVO(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
