package com.ceshi.dao;

import com.ceshi.bean.Myorder;
import com.ceshi.bean.MyorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyorderMapper {
    long countByExample(MyorderExample example);

    int deleteByExample(MyorderExample example);

    int deleteByPrimaryKey(Integer orId);

    int insert(Myorder record);

    int insertSelective(Myorder record);

    List<Myorder> selectByExample(MyorderExample example);
    
    //查询订单中包含的所有信息
    List<Myorder> selectByExampleWithAll(MyorderExample example);
    

    Myorder selectByPrimaryKey(Integer orId);
    
    //查询最新一条兑换记录与我的积分
    Myorder selectRecentAndIntegral(@Param("record") int memberid);

    int updateByExampleSelective(@Param("record") Myorder record, @Param("example") MyorderExample example);

    int updateByExample(@Param("record") Myorder record, @Param("example") MyorderExample example);

    int updateByPrimaryKeySelective(Myorder record);

    int updateByPrimaryKey(Myorder record);

	List<Myorder> selectAllIntegralInfo();

	List<Myorder> selectWithMem();

	List<Myorder> selectByExampleWithMem(MyorderExample example);
}