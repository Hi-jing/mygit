package com.ceshi.dao;

import com.ceshi.bean.Go_kind;
import com.ceshi.bean.Go_kindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Go_kindMapper {
    long countByExample(Go_kindExample example);

    int deleteByExample(Go_kindExample example);

    int deleteByPrimaryKey(Integer kiId);

    int insert(Go_kind record);

    int insertSelective(Go_kind record);

    List<Go_kind> selectByExample(Go_kindExample example);

    Go_kind selectByPrimaryKey(Integer kiId);

    int updateByExampleSelective(@Param("record") Go_kind record, @Param("example") Go_kindExample example);

    int updateByExample(@Param("record") Go_kind record, @Param("example") Go_kindExample example);

    int updateByPrimaryKeySelective(Go_kind record);

    int updateByPrimaryKey(Go_kind record);
}