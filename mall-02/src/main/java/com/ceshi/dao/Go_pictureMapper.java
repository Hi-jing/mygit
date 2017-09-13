package com.ceshi.dao;

import com.ceshi.bean.Go_picture;
import com.ceshi.bean.Go_pictureExample;
import com.ceshi.bean.Go_pictureWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Go_pictureMapper {
    long countByExample(Go_pictureExample example);

    int deleteByExample(Go_pictureExample example);

    int deleteByPrimaryKey(Integer piId);

    int insert(Go_pictureWithBLOBs record);

    int insertSelective(Go_pictureWithBLOBs record);

    List<Go_pictureWithBLOBs> selectByExampleWithBLOBs(Go_pictureExample example);
    
    List<Go_pictureWithBLOBs> selectByGoodIdWithPi_Lb();

    List<Go_picture> selectByExample(Go_pictureExample example);

    Go_pictureWithBLOBs selectByPrimaryKey(Integer piId);

    int updateByExampleSelective(@Param("record") Go_pictureWithBLOBs record, @Param("example") Go_pictureExample example);

    int updateByExampleWithBLOBs(@Param("record") Go_pictureWithBLOBs record, @Param("example") Go_pictureExample example);

    int updateByExample(@Param("record") Go_picture record, @Param("example") Go_pictureExample example);

    int updateByPrimaryKeySelective(Go_pictureWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(Go_pictureWithBLOBs record);

    int updateByPrimaryKey(Go_picture record);
    
//    byte[] selectByGoodIdWithPi_Lb();
}