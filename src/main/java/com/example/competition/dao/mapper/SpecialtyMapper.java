package com.example.competition.dao.mapper;

import com.example.competition.dao.model.Specialty;
import com.example.competition.dao.model.SpecialtyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialtyMapper {
    long countByExample(SpecialtyExample example);

    int deleteByExample(SpecialtyExample example);

    int deleteByPrimaryKey(Integer specialtyId);

    int insert(Specialty record);

    int insertSelective(Specialty record);

    List<Specialty> selectByExample(SpecialtyExample example);

    Specialty selectByPrimaryKey(Integer specialtyId);

    int updateByExampleSelective(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    int updateByExample(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    int updateByPrimaryKeySelective(Specialty record);

    int updateByPrimaryKey(Specialty record);
}