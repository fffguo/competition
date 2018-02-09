package com.example.competition.service.impl;

import com.example.competition.dao.entity.Report;
import com.example.competition.dao.repository.ReportRepository;
import com.example.competition.service.ReportService;
import com.example.competition.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @作者：刘富国
 * @创建时间：2018/1/30 9:25
 */
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<Report> findAll(Report report) {
        //1.查询所有report
        if(null==report){
            return reportRepository.findAll();
        }
        //2.查询指定状态的report
        if(!StringUtils.isEmpty(report.getReportStatus())){
            return reportRepository.findByReportStatusOrderByCreateTimeDesc(report.getReportStatus());
        }
        return null;
    }

    @Override
    public Report save(Report report) {
        return reportRepository.save(report);
    }

    @Override
    public Report findOne(Integer id) {
        Report report=reportRepository.findOne(id);
        return report;
    }
}
