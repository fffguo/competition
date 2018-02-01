package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @作者：刘富国
 * @创建时间：2018/1/21 0:12
 */
public interface ReportRepository extends JpaRepository<Report, Integer> {

    List<Report> findByReportStatusOrderByCreateTimeDesc(Integer reportStatus);




}