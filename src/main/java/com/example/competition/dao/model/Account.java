package com.example.competition.dao.model;

import java.util.Date;

public class Account {
    private Integer accountId;

    private String accountLoginName;

    private String accountPassword;

    private Integer accountStatus;

    private Integer accountOwner;

    private Integer accountOwnerId;

    private Date createTime;

    private Date updateTime;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountLoginName() {
        return accountLoginName;
    }

    public void setAccountLoginName(String accountLoginName) {
        this.accountLoginName = accountLoginName == null ? null : accountLoginName.trim();
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(Integer accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Integer getAccountOwnerId() {
        return accountOwnerId;
    }

    public void setAccountOwnerId(Integer accountOwnerId) {
        this.accountOwnerId = accountOwnerId;
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