package com.ceshi.dao;

import com.ceshi.bean.Me_integral;
import com.ceshi.bean.Me_integralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me_integralMapper {
    long countByExample(Me_integralExample example);

    int deleteByExample(Me_integralExample example);

    int deleteByPrimaryKey(Integer inId);

    int insert(Me_integral record);

    int insertSelective(Me_integral record);

    List<Me_integral> selectByExample(Me_integralExample example);

    Me_integral selectByPrimaryKey(Integer inId);

    int updateByExampleSelective(@Param("record") Me_integral record, @Param("example") Me_integralExample example);

    int updateByExample(@Param("record") Me_integral record, @Param("example") Me_integralExample example);

    int updateByPrimaryKeySelective(Me_integral record);

    int updateByPrimaryKey(Me_integral record);
}