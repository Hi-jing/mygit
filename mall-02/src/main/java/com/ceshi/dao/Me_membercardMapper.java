package com.ceshi.dao;

import com.ceshi.bean.Me_membercard;
import com.ceshi.bean.Me_membercardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me_membercardMapper {
    long countByExample(Me_membercardExample example);

    int deleteByExample(Me_membercardExample example);

    int deleteByPrimaryKey(Integer mcId);

    int insert(Me_membercard record);

    int insertSelective(Me_membercard record);

    List<Me_membercard> selectByExample(Me_membercardExample example);
    
    //我的会员卡页面的全部信息
    List<Me_membercard> selectByExampleWithAll(Me_membercardExample example);

    Me_membercard selectByPrimaryKey(Integer mcId);

    int updateByExampleSelective(@Param("record") Me_membercard record, @Param("example") Me_membercardExample example);

    int updateByExample(@Param("record") Me_membercard record, @Param("example") Me_membercardExample example);

    int updateByPrimaryKeySelective(Me_membercard record);

    int updateByPrimaryKey(Me_membercard record);
}