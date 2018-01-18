package com.example.competition.utils;

import com.example.competition.VO.ResultVO;
import com.example.competition.enums.ErrorEnum;
import com.example.competition.enums.ResultVOEnum;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 10:35
 */
public class ResultVOUtil {

    /** 成功，返回data*/
    public static ResultVO success(Object data){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(ResultVOEnum.SUCCESS.getCode());
        resultVO.setMessage(ResultVOEnum.SUCCESS.getMessage());
        resultVO.setData(data);
        return resultVO;
    }
    /** 成功，返回null */
    public static ResultVO success(){
        return success(null);
    }

    /** 失败，入参为ErrorEnum */
    public static ResultVO error(ErrorEnum errorEnum){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(errorEnum.getCode());
        resultVO.setMessage(errorEnum.getMessage());
        return resultVO;
    }
    /** 失败，自定义入参 */
    public static ResultVO error(Integer code, String message){
        ResultVO resultVO=new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessage(message);
        return resultVO;
    }
}
