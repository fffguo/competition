package com.example.competition.service;

import com.example.competition.dao.entity.Report;

import java.util.List;

/**
 * @作者：刘富国
 * @创建时间：2018/1/30 9:23
 */
public interface ReportService {
    /** 根据条件，查询所有report */
    List<Report> findAll(Report report);

    /** update or insert */
    Report save(Report report);

    /** 根据id 查询 */
    Report findOne(Integer id);
}
