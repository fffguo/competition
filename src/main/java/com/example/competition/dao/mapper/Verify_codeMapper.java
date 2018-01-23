package com.example.competition.dao.mapper;

import com.example.competition.dao.model.Verify_code;
import com.example.competition.dao.model.Verify_codeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Verify_codeMapper {
    long countByExample(Verify_codeExample example);

    int deleteByExample(Verify_codeExample example);

    int deleteByPrimaryKey(String codeId);

    int insert(Verify_code record);

    int insertSelective(Verify_code record);

    List<Verify_code> selectByExample(Verify_codeExample example);

    Verify_code selectByPrimaryKey(String codeId);

    int updateByExampleSelective(@Param("record") Verify_code record, @Param("example") Verify_codeExample example);

    int updateByExample(@Param("record") Verify_code record, @Param("example") Verify_codeExample example);

    int updateByPrimaryKeySelective(Verify_code record);

    int updateByPrimaryKey(Verify_code record);
}