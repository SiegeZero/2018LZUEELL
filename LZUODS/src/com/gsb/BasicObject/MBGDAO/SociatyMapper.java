package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBG.Sociaty;
import com.gsb.BasicObject.MBG.SociatyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SociatyMapper {
    long countByExample(SociatyExample example);

    int deleteByExample(SociatyExample example);

    int deleteByPrimaryKey(Integer sociatyNo);

    int insert(Sociaty record);

    int insertSelective(Sociaty record);

    List<Sociaty> selectByExampleWithBLOBs(SociatyExample example);

    List<Sociaty> selectByExample(SociatyExample example);
    
    List<String> selectAllSociaties(); 

    Sociaty selectByPrimaryKey(Integer sociatyNo);

    int updateByExampleSelective(@Param("record") Sociaty record, @Param("example") SociatyExample example);

    int updateByExampleWithBLOBs(@Param("record") Sociaty record, @Param("example") SociatyExample example);

    int updateByExample(@Param("record") Sociaty record, @Param("example") SociatyExample example);

    int updateByPrimaryKeySelective(Sociaty record);

    int updateByPrimaryKeyWithBLOBs(Sociaty record);

    int updateByPrimaryKey(Sociaty record);
}