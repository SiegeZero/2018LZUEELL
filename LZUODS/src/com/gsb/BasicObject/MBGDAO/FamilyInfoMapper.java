package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.FamilyInfo;
import com.gsb.BasicObject.MBGPOJO.FamilyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyInfoMapper {
    long countByExample(FamilyInfoExample example);

    int deleteByExample(FamilyInfoExample example);

    int insert(FamilyInfo record);

    int insertSelective(FamilyInfo record);

    List<FamilyInfo> selectByExample(FamilyInfoExample example);

    int updateByExampleSelective(@Param("record") FamilyInfo record, @Param("example") FamilyInfoExample example);

    int updateByExample(@Param("record") FamilyInfo record, @Param("example") FamilyInfoExample example);
}