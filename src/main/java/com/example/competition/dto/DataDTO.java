package com.example.competition.dto;

import com.example.competition.dao.entity.Report;

/**
 * @作者：胡鹏鹏
 * @创建时间：2018/1/20 20:14
 */
public class DataDTO {
    String appid;
    String isAjax;
    Report data;

    public DataDTO(String appid, String isAjax, Report data) {
        this.appid = appid;
        this.isAjax = isAjax;
        this.data = data;
    }

    public DataDTO() {
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getIsAjax() {
        return isAjax;
    }

    public void setIsAjax(String isAjax) {
        this.isAjax = isAjax;
    }

    public Report getData() {
        return data;
    }

    public void setData(Report data) {
        this.data = data;
    }
}
