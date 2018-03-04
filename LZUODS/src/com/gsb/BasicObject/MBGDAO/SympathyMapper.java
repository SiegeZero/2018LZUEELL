package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.Sympathy;
import com.gsb.BasicObject.MBGPOJO.SympathyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SympathyMapper {
    long countByExample(SympathyExample example);

    int deleteByExample(SympathyExample example);

    int insert(Sympathy record);

    int insertSelective(Sympathy record);

    List<Sympathy> selectByExample(SympathyExample example);

    int updateByExampleSelective(@Param("record") Sympathy record, @Param("example") SympathyExample example);

    int updateByExample(@Param("record") Sympathy record, @Param("example") SympathyExample example);
}