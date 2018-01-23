package com.example.competition.dao.model;

import java.util.Date;

public class Verify_code {
    private String codeId;

    private String codeContent;

    private Integer codeAction;

    private Integer codeStatus;

    private Integer accountId;

    private Date createTime;

    private Date updateTime;

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId == null ? null : codeId.trim();
    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent == null ? null : codeContent.trim();
    }

    public Integer getCodeAction() {
        return codeAction;
    }

    public void setCodeAction(Integer codeAction) {
        this.codeAction = codeAction;
    }

    public Integer getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(Integer codeStatus) {
        this.codeStatus = codeStatus;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}