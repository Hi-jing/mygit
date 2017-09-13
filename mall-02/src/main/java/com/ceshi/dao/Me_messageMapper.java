package com.ceshi.dao;

import com.ceshi.bean.Me_message;
import com.ceshi.bean.Me_messageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Me_messageMapper {
    long countByExample(Me_messageExample example);

    int deleteByExample(Me_messageExample example);

    int deleteByPrimaryKey(Integer meId);

    int insert(Me_message record);

    int insertSelective(Me_message record);

    List<Me_message> selectByExampleWithBLOBs(Me_messageExample example);

    List<Me_message> selectByExample(Me_messageExample example);

    Me_message selectByPrimaryKey(Integer meId);

    int updateByExampleSelective(@Param("record") Me_message record, @Param("example") Me_messageExample example);

    int updateByExampleWithBLOBs(@Param("record") Me_message record, @Param("example") Me_messageExample example);

    int updateByExample(@Param("record") Me_message record, @Param("example") Me_messageExample example);

    int updateByPrimaryKeySelective(Me_message record);

    int updateByPrimaryKeyWithBLOBs(Me_message record);

    int updateByPrimaryKey(Me_message record);
}