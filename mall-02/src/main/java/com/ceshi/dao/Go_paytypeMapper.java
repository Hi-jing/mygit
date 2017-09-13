package com.ceshi.dao;

import com.ceshi.bean.Go_paytype;
import com.ceshi.bean.Go_paytypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Go_paytypeMapper {
    long countByExample(Go_paytypeExample example);

    int deleteByExample(Go_paytypeExample example);

    int deleteByPrimaryKey(Integer ptId);

    int insert(Go_paytype record);

    int insertSelective(Go_paytype record);

    List<Go_paytype> selectByExample(Go_paytypeExample example);

    Go_paytype selectByPrimaryKey(Integer ptId);

    int updateByExampleSelective(@Param("record") Go_paytype record, @Param("example") Go_paytypeExample example);

    int updateByExample(@Param("record") Go_paytype record, @Param("example") Go_paytypeExample example);

    int updateByPrimaryKeySelective(Go_paytype record);

    int updateByPrimaryKey(Go_paytype record);
}