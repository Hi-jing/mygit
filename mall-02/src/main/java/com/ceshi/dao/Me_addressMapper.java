package com.ceshi.dao;

import com.ceshi.bean.Me_address;
import com.ceshi.bean.Me_addressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me_addressMapper {
    long countByExample(Me_addressExample example);

    int deleteByExample(Me_addressExample example);

    int deleteByPrimaryKey(Integer adId);

    int insert(Me_address record);

    int insertSelective(Me_address record);

    List<Me_address> selectByExample(Me_addressExample example);

    Me_address selectByPrimaryKey(Integer adId);

    int updateByExampleSelective(@Param("record") Me_address record, @Param("example") Me_addressExample example);

    int updateByExample(@Param("record") Me_address record, @Param("example") Me_addressExample example);

    int updateByPrimaryKeySelective(Me_address record);

    int updateByPrimaryKey(Me_address record);
}