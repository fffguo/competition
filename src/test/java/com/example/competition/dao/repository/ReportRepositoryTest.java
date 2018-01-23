package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Report;
import com.example.competition.dao.mapper.ReportMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/21 10:52
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ReportRepositoryTest {

    @Autowired
    private ReportRepository repository;

    @Autowired
    ReportMapper reportMapper;

    @Test
    public void save(){
        Report report=new Report();
        report.setMainStudentGrade("2018");
        report.setMainStudentSpecialty("jisuanji");
        report.setMainStudentQq("5957");
        report.setMainStudentPhone("111111");
        report.setMainStudentName("qqq");
        report.setStudent1No("415");
        report.setMainStudentEmail("sss");
        report.setMainStudentDepartment("dd");
        report.setTeacherDepartment("ww");
        report.setTeacherEmail("www");
        report.setTeacherName("Wwwww");
        report.setTeacherPhone("wwaa");
        report.setTeacherQq("qqq");
        //Report result=repository.save(report);
        reportMapper.insert(report);
    }

}