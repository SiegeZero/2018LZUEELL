package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.SympathyAtv;
import com.gsb.BasicObject.MBGPOJO.SympathyAtvExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SympathyAtvMapper {
    long countByExample(SympathyAtvExample example);

    int deleteByExample(SympathyAtvExample example);

    int deleteByPrimaryKey(Integer activityNo);

    int insert(SympathyAtv record);

    int insertSelective(SympathyAtv record);

    List<SympathyAtv> selectByExampleWithBLOBs(SympathyAtvExample example);

    List<SympathyAtv> selectByExample(SympathyAtvExample example);

    SympathyAtv selectByPrimaryKey(Integer activityNo);

    int updateByExampleSelective(@Param("record") SympathyAtv record, @Param("example") SympathyAtvExample example);

    int updateByExampleWithBLOBs(@Param("record") SympathyAtv record, @Param("example") SympathyAtvExample example);

    int updateByExample(@Param("record") SympathyAtv record, @Param("example") SympathyAtvExample example);

    int updateByPrimaryKeySelective(SympathyAtv record);

    int updateByPrimaryKeyWithBLOBs(SympathyAtv record);

    int updateByPrimaryKey(SympathyAtv record);
}