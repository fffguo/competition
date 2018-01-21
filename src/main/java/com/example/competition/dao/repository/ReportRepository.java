package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Report;
import com.example.competition.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @作者：刘富国
 * @创建时间：2018/1/21 0:12
 */
public interface ReportRepository extends JpaRepository<Report, Integer> {

}