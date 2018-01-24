package com.example.competition.dao.mapper;

import com.example.competition.dao.repository.DepartmentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @作者：刘富国
 * @创建时间：2018/1/23 12:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DepartmentMapperTest {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void test() {
        System.out.println(departmentMapper.selectByPrimaryKey(1).getDepartmentName());
    }

    @Test
    public void test2(){
        System.out.println(departmentRepository.findOne(1));
    }


}