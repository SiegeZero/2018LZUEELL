package BasicObject.MBGDAO;

import BasicObject.MBG.Person;
import BasicObject.MBG.PersonExample;
import BasicObject.MBG.PersonWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer sysNo);

    int insert(PersonWithBLOBs record);

    int insertSelective(PersonWithBLOBs record);

    List<PersonWithBLOBs> selectByExampleWithBLOBs(PersonExample example);

    List<Person> selectByExample(PersonExample example);

    PersonWithBLOBs selectByPrimaryKey(Integer sysNo);

    int updateByExampleSelective(@Param("record") PersonWithBLOBs record, @Param("example") PersonExample example);

    int updateByExampleWithBLOBs(@Param("record") PersonWithBLOBs record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(PersonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PersonWithBLOBs record);

    int updateByPrimaryKey(Person record);
}