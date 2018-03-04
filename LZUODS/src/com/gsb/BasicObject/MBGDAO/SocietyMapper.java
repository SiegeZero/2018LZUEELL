package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.Society;
import com.gsb.BasicObject.MBGPOJO.SocietyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocietyMapper {
    long countByExample(SocietyExample example);

    int deleteByExample(SocietyExample example);

    int deleteByPrimaryKey(Integer societyNo);

    int insert(Society record);

    int insertSelective(Society record);

    List<Society> selectByExampleWithBLOBs(SocietyExample example);

    List<Society> selectByExample(SocietyExample example);

    Society selectByPrimaryKey(Integer societyNo);

    int updateByExampleSelective(@Param("record") Society record, @Param("example") SocietyExample example);

    int updateByExampleWithBLOBs(@Param("record") Society record, @Param("example") SocietyExample example);

    int updateByExample(@Param("record") Society record, @Param("example") SocietyExample example);

    int updateByPrimaryKeySelective(Society record);

    int updateByPrimaryKeyWithBLOBs(Society record);

    int updateByPrimaryKey(Society record);
}