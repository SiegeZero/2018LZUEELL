package com.gsb.BasicObject.MBGDAO;

import com.gsb.BasicObject.MBGPOJO.WorkPlan;
import com.gsb.BasicObject.MBGPOJO.WorkPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkPlanMapper {
    long countByExample(WorkPlanExample example);

    int deleteByExample(WorkPlanExample example);

    int insert(WorkPlan record);

    int insertSelective(WorkPlan record);

    List<WorkPlan> selectByExampleWithBLOBs(WorkPlanExample example);

    List<WorkPlan> selectByExample(WorkPlanExample example);

    int updateByExampleSelective(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);

    int updateByExample(@Param("record") WorkPlan record, @Param("example") WorkPlanExample example);
}