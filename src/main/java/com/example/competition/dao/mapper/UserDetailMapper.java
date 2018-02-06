package com.example.competition.dao.mapper;

import com.example.competition.dao.model.UserDetail;
import com.example.competition.dao.model.UserDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailMapper {
    long countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}