package BasicObject.MBGDAO;

import BasicObject.MBG.SympathyAct;
import BasicObject.MBG.SympathyActExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SympathyActMapper {
    long countByExample(SympathyActExample example);

    int deleteByExample(SympathyActExample example);

    int deleteByPrimaryKey(Integer activityNo);

    int insert(SympathyAct record);

    int insertSelective(SympathyAct record);

    List<SympathyAct> selectByExampleWithBLOBs(SympathyActExample example);

    List<SympathyAct> selectByExample(SympathyActExample example);

    SympathyAct selectByPrimaryKey(Integer activityNo);

    int updateByExampleSelective(@Param("record") SympathyAct record, @Param("example") SympathyActExample example);

    int updateByExampleWithBLOBs(@Param("record") SympathyAct record, @Param("example") SympathyActExample example);

    int updateByExample(@Param("record") SympathyAct record, @Param("example") SympathyActExample example);

    int updateByPrimaryKeySelective(SympathyAct record);

    int updateByPrimaryKeyWithBLOBs(SympathyAct record);

    int updateByPrimaryKey(SympathyAct record);
}