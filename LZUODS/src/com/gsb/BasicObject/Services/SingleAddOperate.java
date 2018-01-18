package com.gsb.BasicObject.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBG.Department;
import com.gsb.BasicObject.MBG.PersonExample;
import com.gsb.BasicObject.MBG.PersonWithBLOBs;
import com.gsb.BasicObject.MBG.SalaryLib;
import com.gsb.BasicObject.MBG.Sociaty;
import com.gsb.BasicObject.MBG.SourcePerson;
import com.gsb.BasicObject.MBG.PersonExample.Criteria;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.PersonMapper;
import com.gsb.BasicObject.MBGDAO.SalaryLibMapper;
import com.gsb.BasicObject.MBGDAO.SociatyMapper;

@Service
public class SingleAddOperate {
	
	
	
	@Autowired
	PersonMapper person_mapper;
	
	Map<String,Integer> depts_map,sociaties_map,slib_map;
	@Autowired
	SociatyMapper sociaties_mapper;
	@Autowired
	SalaryLibMapper slib_mapper;
	
	private void init() {
		List<Department> depts = dept_mapper.selectByExample(null);
		depts_map = new HashMap<>();
		for( Department d:depts) {
			depts_map.put(d.getDeptName(), d.getDeptNo());
		}
		List<Sociaty> sociaties = sociaties_mapper.selectByExample(null);
		sociaties_map = new HashMap<>();
		for( Sociaty d:sociaties) {
			sociaties_map.put(d.getSociatyName(), d.getSociatyNo());
		}
		List<SalaryLib> slib = slib_mapper.selectByExample(null);
		slib_map = new HashMap<>();
		for( SalaryLib d:slib) {
			slib_map.put(d.getSalaryVersion(), d.getSalaryLibNo());
		}
		
		
	}

	public int addAPerson( SourcePerson person) {
		init();
		person_mapper.insertSelective( person.format(depts_map, sociaties_map, slib_map));
		
		PersonExample personExample = new PersonExample();
		Criteria criteria = personExample.createCriteria();
		if (person.getName() != null)
			criteria.andNameEqualTo(person.getName());
		if (person.getDeptNo() != null)
			criteria.andDeptNoEqualTo(person.getDeptNo());
		if (person.getSociatyNo() != null)
			criteria.andSociatyNoEqualTo(person.getSociatyNo());
		if (person.getSalaryNo() != null)
			criteria.andSalaryNoEqualTo(person.getSalaryNo());
		if (person.getBirthTime() != null)
			criteria.andBirthTimeEqualTo(person.getBirthTime());
		personExample.or(criteria);
		List<SourcePerson> selectByExample = person_mapper.selectAllForShow(personExample);
		int target_id = -1;
		if( selectByExample != null && selectByExample.size() > 0) {
			target_id = selectByExample.get(0).getSysNo();
		}
		return target_id;
	}
	
	
	@Autowired
	SociatyMapper sociaty_mapper;
	
	@Autowired
	DepartmentMapper dept_mapper;

	public void updatePersonInfo(SourcePerson new_person) {
		init();
		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andSysNoEqualTo( new_person.getSysNo());
		example.or(c);
		person_mapper.updateByExampleWithBLOBs(new_person.format(depts_map, sociaties_map, slib_map), example);
	}
}
