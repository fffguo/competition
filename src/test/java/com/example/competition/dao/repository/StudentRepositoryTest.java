package com.example.competition.dao.repository;

import com.example.competition.dao.entity.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @作者：刘富国
 * @创建时间：2018/1/18 12:42
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository repository;

    @Test
    public void findByStudentStatus() {
        PageRequest pageRequest = new PageRequest(0, 10);
        Page<Student> result = repository.findByStudentStatus(pageRequest, 1);
        Assert.assertEquals(1, result.getTotalElements());
    }

    @Test
    public void findOne() {
        Student result = repository.findOne(1);
        System.out.println(result.toString());
    }
}