package com.example.competition.dao.mapper;

import com.example.competition.dao.model.User_role_rel;
import com.example.competition.dao.model.User_role_relExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_role_relMapper {
    long countByExample(User_role_relExample example);

    int deleteByExample(User_role_relExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User_role_rel record);

    int insertSelective(User_role_rel record);

    List<User_role_rel> selectByExample(User_role_relExample example);

    User_role_rel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User_role_rel record, @Param("example") User_role_relExample example);

    int updateByExample(@Param("record") User_role_rel record, @Param("example") User_role_relExample example);

    int updateByPrimaryKeySelective(User_role_rel record);

    int updateByPrimaryKey(User_role_rel record);
}