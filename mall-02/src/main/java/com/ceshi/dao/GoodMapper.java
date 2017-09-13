package com.ceshi.dao;

import com.ceshi.bean.Good;
import com.ceshi.bean.GoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodMapper {
    long countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(Integer goId);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);
    
    //补差商品全部查询
    List<Good> selectBuChaGood();
    
    //0元兑换商品全部查询
    List<Good> selectZeroGood();
    
    //商品排名最前7条
    List<Good> selectGoodRank();
    
    
    
    //特价商品
    List<Good> selectSpecialPriceGood(@Param("goId01")Integer goId01,
    		@Param("goId02")Integer goId02,@Param("goId03")Integer goId03);
    
    //热销商品
    List<Good> selectHotSellGood();
    
    //服装商品
    List<Good> selectClothing();
    
    
    //手机数码商品
    List<Good> selectMobiles();
    
    
    
    List<Integer> selectSpecialPriceGoodId();
    
    List<Integer> selectLbGoodId();

    Good selectByPrimaryKey(Integer goId);
    
    List<Good> selectGoodIdByMaxBuySum();

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

	List<Good> selectByExampleWithLike(GoodExample example);

	Good selectDetailsById(@Param("goodid")int goodid);
}