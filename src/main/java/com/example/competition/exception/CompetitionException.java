package com.example.competition.exception;

import com.example.competition.enums.ErrorEnum;
import lombok.Data;
import lombok.Getter;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 10:22
 */
@Data
public class CompetitionException extends RuntimeException {
    private Integer code;

    public CompetitionException(ErrorEnum errorEnum) {
        super(errorEnum.getMessage());
        this.code=errorEnum.getCode();
    }

    public CompetitionException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
