package com.example.competition.dao.mapper;

import com.example.competition.dao.model.Role_permission_rel;
import com.example.competition.dao.model.Role_permission_relExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_permission_relMapper {
    long countByExample(Role_permission_relExample example);

    int deleteByExample(Role_permission_relExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role_permission_rel record);

    int insertSelective(Role_permission_rel record);

    List<Role_permission_rel> selectByExample(Role_permission_relExample example);

    Role_permission_rel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role_permission_rel record, @Param("example") Role_permission_relExample example);

    int updateByExample(@Param("record") Role_permission_rel record, @Param("example") Role_permission_relExample example);

    int updateByPrimaryKeySelective(Role_permission_rel record);

    int updateByPrimaryKey(Role_permission_rel record);
}