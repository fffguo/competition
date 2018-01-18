package com.example.competition.dao.mapper;

import com.example.competition.dao.entity.Group_teacher_rel;
import com.example.competition.dao.entity.Group_teacher_relExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Group_teacher_relMapper {
    long countByExample(Group_teacher_relExample example);

    int deleteByExample(Group_teacher_relExample example);

    int deleteByPrimaryKey(Integer groupTeacherRelId);

    int insert(Group_teacher_rel record);

    int insertSelective(Group_teacher_rel record);

    List<Group_teacher_rel> selectByExample(Group_teacher_relExample example);

    Group_teacher_rel selectByPrimaryKey(Integer groupTeacherRelId);

    int updateByExampleSelective(@Param("record") Group_teacher_rel record, @Param("example") Group_teacher_relExample example);

    int updateByExample(@Param("record") Group_teacher_rel record, @Param("example") Group_teacher_relExample example);

    int updateByPrimaryKeySelective(Group_teacher_rel record);

    int updateByPrimaryKey(Group_teacher_rel record);
}