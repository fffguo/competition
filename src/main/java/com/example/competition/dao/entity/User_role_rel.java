package com.example.competition.dao.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @作者：刘富国
 * @创建时间：2018/1/26 9:48
 */
@Data
@Entity
@DynamicUpdate
public class User_role_rel {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private Integer roleId;

    private Integer status;

    private Date createtime;

    private Date updatetime;
}
