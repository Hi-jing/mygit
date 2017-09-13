package com.ceshi.dao;

import com.ceshi.bean.Me_coupon;
import com.ceshi.bean.Me_couponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me_couponMapper {
    long countByExample(Me_couponExample example);

    int deleteByExample(Me_couponExample example);

    int deleteByPrimaryKey(Integer couMycouid);

    int insert(Me_coupon record);

    int insertSelective(Me_coupon record);

    List<Me_coupon> selectByExample(Me_couponExample example);

    Me_coupon selectByPrimaryKey(Integer couMycouid);

    int updateByExampleSelective(@Param("record") Me_coupon record, @Param("example") Me_couponExample example);

    int updateByExample(@Param("record") Me_coupon record, @Param("example") Me_couponExample example);

    int updateByPrimaryKeySelective(Me_coupon record);

    int updateByPrimaryKey(Me_coupon record);
}