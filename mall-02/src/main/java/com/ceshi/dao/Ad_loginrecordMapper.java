package com.ceshi.dao;

import com.ceshi.bean.Ad_loginrecord;
import com.ceshi.bean.Ad_loginrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Ad_loginrecordMapper {
    long countByExample(Ad_loginrecordExample example);

    int deleteByExample(Ad_loginrecordExample example);

    int deleteByPrimaryKey(Integer loId);

    int insert(Ad_loginrecord record);

    int insertSelective(Ad_loginrecord record);

    List<Ad_loginrecord> selectByExample(Ad_loginrecordExample example);

    Ad_loginrecord selectByPrimaryKey(Integer loId);

    int updateByExampleSelective(@Param("record") Ad_loginrecord record, @Param("example") Ad_loginrecordExample example);

    int updateByExample(@Param("record") Ad_loginrecord record, @Param("example") Ad_loginrecordExample example);

    int updateByPrimaryKeySelective(Ad_loginrecord record);

    int updateByPrimaryKey(Ad_loginrecord record);
}