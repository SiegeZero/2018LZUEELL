package com.gsb.BasicObject.MBGDAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gsb.BasicObject.MBGPOJO.HelpRecord;
import com.gsb.BasicObject.MBGPOJO.HelpRecordExample;

public interface HelpRecordMapper {
    long countByExample(HelpRecordExample example);

    int deleteByExample(HelpRecordExample example);

    int insert(HelpRecord record);

    int insertSelective(HelpRecord record);

    List<HelpRecord> selectByExampleWithBLOBs(HelpRecordExample example);

    List<HelpRecord> selectByExample(HelpRecordExample example);

    int updateByExampleSelective(@Param("record") HelpRecord record, @Param("example") HelpRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") HelpRecord record, @Param("example") HelpRecordExample example);

    int updateByExample(@Param("record") HelpRecord record, @Param("example") HelpRecordExample example);
}