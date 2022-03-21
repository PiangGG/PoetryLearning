package com.jay.PoetryLearningServer.dao;

import com.jay.PoetryLearningServer.entity.Poetry;
import com.jay.PoetryLearningServer.entity.PoetryExample;
import java.util.List;
import java.util.Vector;

import org.apache.ibatis.annotations.Param;

public interface PoetryMapper {
    long countByExample(PoetryExample example);

    int deleteByExample(PoetryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Poetry record);

    int insertSelective(Poetry record);

    List<Poetry> selectByExample(PoetryExample example);

    Poetry selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Poetry record, @Param("example") PoetryExample example);

    int updateByExample(@Param("record") Poetry record, @Param("example") PoetryExample example);

    int updateByPrimaryKeySelective(Poetry record);

    int updateByPrimaryKey(Poetry record);
}