package com.gsb.BasicObject.MBGDAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gsb.BasicObject.MBGPOJO.Department;
import com.gsb.BasicObject.MBGPOJO.Person;
import com.gsb.BasicObject.MBGPOJO.PersonExample;
import com.gsb.BasicObject.MBGPOJO.PersonWithBLOBs;
import com.gsb.BasicObject.MBGPOJO.SalaryLib;
import com.gsb.BasicObject.MBGPOJO.Sociaty;
import com.gsb.BasicObject.MBGPOJO.SourcePerson;

public interface PersonMapper {
    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Integer sysNo);

    int insert(PersonWithBLOBs record);

    int insertSelective(PersonWithBLOBs record);

    List<PersonWithBLOBs> selectByExampleWithBLOBs(PersonExample example);

    List<SourcePerson> selectByExample(PersonExample example);

    SourcePerson selectByPrimaryKey(Integer sysNo);
    
    List<SourcePerson> selectAllForShow(PersonExample example);

	List<String> selectAllFunc();

	List<String> selectAllTitleLv();
	
	List<String> selectAllNations();
	
	List<String> selectAllConscriptionSituation();
	
	Department selectDeptWithId(Integer dept_no);
	
	Sociaty selectSociatyWithId( Integer sociaty_no);
	
	SalaryLib selectSLibWithId( Integer salary_lib_no);

    int updateByExampleSelective(@Param("record") PersonWithBLOBs record, @Param("example") PersonExample example);

    int updateByExampleWithBLOBs(@Param("record") PersonWithBLOBs record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(PersonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PersonWithBLOBs record);

    int updateByPrimaryKey(Person record);

	List<String> selectAllPoliticalStatus();

	List<String> selectAllEduBg();
}