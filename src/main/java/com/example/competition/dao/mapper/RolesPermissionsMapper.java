package com.example.competition.dao.mapper;

import com.example.competition.dao.model.RolesPermissions;
import com.example.competition.dao.model.RolesPermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesPermissionsMapper {
    long countByExample(RolesPermissionsExample example);

    int deleteByExample(RolesPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolesPermissions record);

    int insertSelective(RolesPermissions record);

    List<RolesPermissions> selectByExample(RolesPermissionsExample example);

    RolesPermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolesPermissions record, @Param("example") RolesPermissionsExample example);

    int updateByExample(@Param("record") RolesPermissions record, @Param("example") RolesPermissionsExample example);

    int updateByPrimaryKeySelective(RolesPermissions record);

    int updateByPrimaryKey(RolesPermissions record);
}