package com.gsb.BasicObject.MBGDAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gsb.BasicObject.MBGPOJO.PensionModel;
import com.gsb.BasicObject.MBGPOJO.PensionModelExample;

public interface PensionModelMapper {
    long countByExample(PensionModelExample example);

    int deleteByExample(PensionModelExample example);

    int deleteByPrimaryKey(Integer pensionModelNo);

    int insert(PensionModel record);

    int insertSelective(PensionModel record);

    List<PensionModel> selectByExampleWithBLOBs(PensionModelExample example);

    List<PensionModel> selectByExample(PensionModelExample example);

    PensionModel selectByPrimaryKey(Integer pensionModelNo);

    int updateByExampleSelective(@Param("record") PensionModel record, @Param("example") PensionModelExample example);

    int updateByExampleWithBLOBs(@Param("record") PensionModel record, @Param("example") PensionModelExample example);

    int updateByExample(@Param("record") PensionModel record, @Param("example") PensionModelExample example);

    int updateByPrimaryKeySelective(PensionModel record);

    int updateByPrimaryKeyWithBLOBs(PensionModel record);

    int updateByPrimaryKey(PensionModel record);
}