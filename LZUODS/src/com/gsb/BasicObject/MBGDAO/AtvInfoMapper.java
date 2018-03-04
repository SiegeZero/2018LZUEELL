package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AtvInfoMapper {
    long countByExample(AtvInfoExample example);

    int deleteByExample(AtvInfoExample example);

    int deleteByPrimaryKey(Integer atvNo);

    int insert(AtvInfo record);

    int insertSelective(AtvInfo record);

    List<AtvInfo> selectByExample(AtvInfoExample example);

    AtvInfo selectByPrimaryKey(Integer atvNo);

    int updateByExampleSelective(@Param("record") AtvInfo record, @Param("example") AtvInfoExample example);

    int updateByExample(@Param("record") AtvInfo record, @Param("example") AtvInfoExample example);

    int updateByPrimaryKeySelective(AtvInfo record);

    int updateByPrimaryKey(AtvInfo record);
}