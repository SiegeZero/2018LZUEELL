package com.gsb.BasicObject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBG.PersonWithBLOBs;
import com.gsb.BasicObject.MBG.SourcePerson;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.PersonMapper;
import com.gsb.BasicObject.MBGDAO.SociatyMapper;

@Service
public class SingleAddOperate {
	
	@Autowired
	PersonMapper person_mapper;
	
	public void addAPerson( SourcePerson sp) {
		PersonWithBLOBs p = new PersonWithBLOBs();
		
		person_mapper.insert( p);
	}
	
	
	@Autowired
	SociatyMapper sociaty_mapper;
	
	@Autowired
	DepartmentMapper dept_mapper;
}
