package BasicObject.MBGDAO;

import BasicObject.MBG.SalaryLib;
import BasicObject.MBG.SalaryLibExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalaryLibMapper {
    long countByExample(SalaryLibExample example);

    int deleteByExample(SalaryLibExample example);

    int deleteByPrimaryKey(Integer salaryLibNo);

    int insert(SalaryLib record);

    int insertSelective(SalaryLib record);

    List<SalaryLib> selectByExampleWithBLOBs(SalaryLibExample example);

    List<SalaryLib> selectByExample(SalaryLibExample example);

    SalaryLib selectByPrimaryKey(Integer salaryLibNo);

    int updateByExampleSelective(@Param("record") SalaryLib record, @Param("example") SalaryLibExample example);

    int updateByExampleWithBLOBs(@Param("record") SalaryLib record, @Param("example") SalaryLibExample example);

    int updateByExample(@Param("record") SalaryLib record, @Param("example") SalaryLibExample example);

    int updateByPrimaryKeySelective(SalaryLib record);

    int updateByPrimaryKeyWithBLOBs(SalaryLib record);

    int updateByPrimaryKey(SalaryLib record);
}