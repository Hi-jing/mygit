package com.ceshi.dao;

import com.ceshi.bean.Me_level;
import com.ceshi.bean.Me_levelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me_levelMapper {
    long countByExample(Me_levelExample example);

    int deleteByExample(Me_levelExample example);

    int deleteByPrimaryKey(Integer leId);

    int insert(Me_level record);

    int insertSelective(Me_level record);

    List<Me_level> selectByExample(Me_levelExample example);

    Me_level selectByPrimaryKey(Integer leId);

    int updateByExampleSelective(@Param("record") Me_level record, @Param("example") Me_levelExample example);

    int updateByExample(@Param("record") Me_level record, @Param("example") Me_levelExample example);

    int updateByPrimaryKeySelective(Me_level record);

    int updateByPrimaryKey(Me_level record);
}