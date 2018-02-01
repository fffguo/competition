package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Report;
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

    @Test
    public void save(){
        Report report=new Report();
        report.setMainStudentGrade("2018");
        report.setMainStudentSpecialty("jisuanji");
        report.setMainStudentQq("5957");
        report.setReportStatus(1);
        report.setMainStudentPhone("111111");
        report.setMainStudentName("qqq");
        report.setMainStudentNo("11p");
        report.setOneStudentNo("415");
        report.setMainStudentEmail("sss");
        report.setMainStudentDepartment("dd");
        report.setTeacherDepartment("ww");
        report.setTeacherEmail("www");
        report.setTeacherName("22");
        report.setTeacherPhone("wwaa");
        report.setWorksName("test");
        report.setTeacherQq("qqq");
        report.setTwoStudentName("Wwe");
        report.setWorksNo("W");
//        Report result=repository.save(report);
//        System.out.println(result);
    }

    @Test
    public void findAll(){
//        System.out.println(repository.findByReportStatus(1).size());
//        System.out.println(repository.findByReportStatus(1).get(0).toString());
    }
}