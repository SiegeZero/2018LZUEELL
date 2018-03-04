package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.RewardRecord;
import com.gsb.BasicObject.MBGPOJO.RewardRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardRecordMapper {
    long countByExample(RewardRecordExample example);

    int deleteByExample(RewardRecordExample example);

    int insert(RewardRecord record);

    int insertSelective(RewardRecord record);

    List<RewardRecord> selectByExampleWithBLOBs(RewardRecordExample example);

    List<RewardRecord> selectByExample(RewardRecordExample example);

    int updateByExampleSelective(@Param("record") RewardRecord record, @Param("example") RewardRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") RewardRecord record, @Param("example") RewardRecordExample example);

    int updateByExample(@Param("record") RewardRecord record, @Param("example") RewardRecordExample example);
}