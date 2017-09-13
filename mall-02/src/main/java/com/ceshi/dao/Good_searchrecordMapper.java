package com.ceshi.dao;

import com.ceshi.bean.Good_searchrecord;
import com.ceshi.bean.Good_searchrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Good_searchrecordMapper {
    long countByExample(Good_searchrecordExample example);

    int deleteByExample(Good_searchrecordExample example);

    int deleteByPrimaryKey(Integer seId);

    int insert(Good_searchrecord record);

    int insertSelective(Good_searchrecord record);

    List<Good_searchrecord> selectByExample(Good_searchrecordExample example);

    Good_searchrecord selectByPrimaryKey(Integer seId);

    int updateByExampleSelective(@Param("record") Good_searchrecord record, @Param("example") Good_searchrecordExample example);

    int updateByExample(@Param("record") Good_searchrecord record, @Param("example") Good_searchrecordExample example);

    int updateByPrimaryKeySelective(Good_searchrecord record);

    int updateByPrimaryKey(Good_searchrecord record);
}