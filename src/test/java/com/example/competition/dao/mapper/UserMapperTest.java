package com.example.competition.dao.mapper;

import com.example.competition.dao.dto.UserRoleDTO;
import com.example.competition.dao.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/26 10:30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUserAndRole() {
        Map<String,Object> map=new HashMap<>();
        map.put("username","root");
//        UserRoleDTO result=userMapper.selectUserAndRole(map);
//        System.out.println(result.toString());
    }
}