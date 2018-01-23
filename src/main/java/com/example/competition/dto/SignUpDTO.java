package com.example.competition.dto;

/**
 * @作者：胡鹏鹏
 * @创建时间：2018/1/20 16:42
 */
public class SignUpDTO {
    private  String appid;
    private  String isAjax;
    private Data data;
    public String getAppid() {
        return appid;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
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
}
