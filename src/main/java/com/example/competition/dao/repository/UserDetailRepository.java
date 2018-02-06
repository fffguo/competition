package com.example.competition.dao.repository;

import com.example.competition.dao.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @作者：刘富国
 * @创建时间：2018/2/6 14:46
 */
public interface UserDetailRepository extends JpaRepository<UserDetail,Integer> {

    UserDetail findByReportId(Integer reportId);
}
