package BasicObject.MBGDAO;

import BasicObject.MBG.EduBG;
import BasicObject.MBG.EduBGExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduBGMapper {
    long countByExample(EduBGExample example);

    int deleteByExample(EduBGExample example);

    int deleteByPrimaryKey(Integer eduBgLv);

    int insert(EduBG record);

    int insertSelective(EduBG record);

    List<EduBG> selectByExampleWithBLOBs(EduBGExample example);

    List<EduBG> selectByExample(EduBGExample example);

    EduBG selectByPrimaryKey(Integer eduBgLv);

    int updateByExampleSelective(@Param("record") EduBG record, @Param("example") EduBGExample example);

    int updateByExampleWithBLOBs(@Param("record") EduBG record, @Param("example") EduBGExample example);

    int updateByExample(@Param("record") EduBG record, @Param("example") EduBGExample example);

    int updateByPrimaryKeySelective(EduBG record);

    int updateByPrimaryKeyWithBLOBs(EduBG record);

    int updateByPrimaryKey(EduBG record);
}