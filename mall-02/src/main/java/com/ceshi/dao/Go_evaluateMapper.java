package com.ceshi.dao;

import com.ceshi.bean.Go_evaluate;
import com.ceshi.bean.Go_evaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Go_evaluateMapper {
    long countByExample(Go_evaluateExample example);

    int deleteByExample(Go_evaluateExample example);

    int deleteByPrimaryKey(Integer evId);

    int insert(Go_evaluate record);

    int insertSelective(Go_evaluate record);

    List<Go_evaluate> selectByExample(Go_evaluateExample example);

    Go_evaluate selectByPrimaryKey(Integer evId);

    int updateByExampleSelective(@Param("record") Go_evaluate record, @Param("example") Go_evaluateExample example);

    int updateByExample(@Param("record") Go_evaluate record, @Param("example") Go_evaluateExample example);

    int updateByPrimaryKeySelective(Go_evaluate record);

    int updateByPrimaryKey(Go_evaluate record);

	List<Go_evaluate> selectByExampleWithEvaluate(Go_evaluateExample example);
}