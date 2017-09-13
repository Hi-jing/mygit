package com.ceshi.dao;

import com.ceshi.bean.Or_good;
import com.ceshi.bean.Or_goodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Or_goodMapper {
    long countByExample(Or_goodExample example);

    int deleteByExample(Or_goodExample example);

    int deleteByPrimaryKey(Integer goId);

    int insert(Or_good record);

    int insertSelective(Or_good record);

    List<Or_good> selectByExample(Or_goodExample example);

    Or_good selectByPrimaryKey(Integer goId);

    int updateByExampleSelective(@Param("record") Or_good record, @Param("example") Or_goodExample example);

    int updateByExample(@Param("record") Or_good record, @Param("example") Or_goodExample example);

    int updateByPrimaryKeySelective(Or_good record);

    int updateByPrimaryKey(Or_good record);
}