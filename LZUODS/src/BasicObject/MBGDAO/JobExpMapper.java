package BasicObject.MBGDAO;

import BasicObject.MBG.JobExp;
import BasicObject.MBG.JobExpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobExpMapper {
    long countByExample(JobExpExample example);

    int deleteByExample(JobExpExample example);

    int deleteByPrimaryKey(Integer sysNo);

    int insert(JobExp record);

    int insertSelective(JobExp record);

    List<JobExp> selectByExampleWithBLOBs(JobExpExample example);

    List<JobExp> selectByExample(JobExpExample example);

    JobExp selectByPrimaryKey(Integer sysNo);

    int updateByExampleSelective(@Param("record") JobExp record, @Param("example") JobExpExample example);

    int updateByExampleWithBLOBs(@Param("record") JobExp record, @Param("example") JobExpExample example);

    int updateByExample(@Param("record") JobExp record, @Param("example") JobExpExample example);

    int updateByPrimaryKeySelective(JobExp record);

    int updateByPrimaryKeyWithBLOBs(JobExp record);

    int updateByPrimaryKey(JobExp record);
}