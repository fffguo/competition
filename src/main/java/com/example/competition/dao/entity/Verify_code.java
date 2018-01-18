package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class Verify_code {
    @Id
    private String codeId;

    private String codeContent;

    private Integer codeAction;

    private Integer codeStatus;

    private Integer accountId;

    private Date createTime;

    private Date updateTime;

}