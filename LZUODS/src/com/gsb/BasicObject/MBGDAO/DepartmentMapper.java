package com.gsb.BasicObject.MBGDAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.gsb.BasicObject.MBGPOJO.Department;
import com.gsb.BasicObject.MBGPOJO.DepartmentExample;
import com.gsb.BasicObject.MBGPOJO.SourcePerson;

public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer deptNo);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExampleWithBLOBs(DepartmentExample example);

    List<Department> selectByExample(DepartmentExample example);

    List<String> selectAllDepts(); 
    
    Department selectByPrimaryKey(Integer deptNo);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExampleWithBLOBs(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKeyWithBLOBs(Department record);

    int updateByPrimaryKey(Department record);
}