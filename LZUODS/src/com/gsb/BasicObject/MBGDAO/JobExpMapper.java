package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBG.JobExp;
import com.gsb.BasicObject.MBG.JobExpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobExpMapper {
    long countByExample(JobExpExample example);

    int deleteByExample(JobExpExample example);

    int insert(JobExp record);

    int insertSelective(JobExp record);

    List<JobExp> selectByExampleWithBLOBs(JobExpExample example);

    List<JobExp> selectByExample(JobExpExample example);

    int updateByExampleSelective(@Param("record") JobExp record, @Param("example") JobExpExample example);

    int updateByExampleWithBLOBs(@Param("record") JobExp record, @Param("example") JobExpExample example);

    int updateByExample(@Param("record") JobExp record, @Param("example") JobExpExample example);
}