package com.ceshi.dao;

import com.ceshi.bean.Integrallucky;
import com.ceshi.bean.IntegralluckyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralluckyMapper {
    long countByExample(IntegralluckyExample example);

    int deleteByExample(IntegralluckyExample example);

    int deleteByPrimaryKey(Integer ilId);

    int insert(Integrallucky record);

    int insertSelective(Integrallucky record);

    List<Integrallucky> selectByExample(IntegralluckyExample example);

    Integrallucky selectByPrimaryKey(Integer ilId);

    int updateByExampleSelective(@Param("record") Integrallucky record, @Param("example") IntegralluckyExample example);

    int updateByExample(@Param("record") Integrallucky record, @Param("example") IntegralluckyExample example);

    int updateByPrimaryKeySelective(Integrallucky record);

    int updateByPrimaryKey(Integrallucky record);
}