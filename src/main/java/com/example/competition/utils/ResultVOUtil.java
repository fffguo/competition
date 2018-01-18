package com.example.competition.utils;

import com.example.competition.enums.ErrorEnum;
import com.example.competition.enums.ResultVOEnum;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 10:35
 */
public class ResultVOUtil {

    /** 成功，返回data*/
    public static ServiceResponse success(Object data){
        ServiceResponse resultVO=new ServiceResponse();
        resultVO.setCode(ResultVOEnum.SUCCESS.getCode());
        resultVO.setMessage(ResultVOEnum.SUCCESS.getMessage());
        resultVO.setData(data);
        return resultVO;
    }
    /** 成功，返回null */
    public static ServiceResponse success(){
        return success(null);
    }

    /** 失败，入参为ErrorEnum */
    public static ServiceResponse error(ErrorEnum errorEnum){
        ServiceResponse resultVO=new ServiceResponse();
        resultVO.setCode(errorEnum.getCode());
        resultVO.setMessage(errorEnum.getMsg());
        return resultVO;
    }
    /** 失败，自定义入参 */
    public static ServiceResponse error(Integer code, String message){
        ServiceResponse resultVO=new ServiceResponse();
        resultVO.setCode(code);
        resultVO.setMessage(message);
        return resultVO;
    }
}
