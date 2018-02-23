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
	
	static Map<String,Integer> depts_map,sociaties_map,slib_map;
	
	@Autowired
	PersonMapper person_mapper;
	@Autowired
	SalaryLibMapper slib_mapper;
	@Autowired
	SociatyMapper sociaty_mapper;
	@Autowired
	DepartmentMapper dept_mapper;
	
	private void init() {
		if( depts_map == null || depts_map.isEmpty()) {
			List<Department> depts = dept_mapper.selectByExample(null);
			depts_map = new HashMap<>();
			for( Department d:depts) {
				depts_map.put(d.getDeptName(), d.getDeptNo());
			}
		}
		
		if( sociaties_map == null || sociaties_map.isEmpty()) {
			List<Sociaty> sociaties = sociaty_mapper.selectByExample(null);
			sociaties_map = new HashMap<>();
			for( Sociaty d:sociaties) {
				sociaties_map.put(d.getSociatyName(), d.getSociatyNo());
			}
		}

		if( slib_map == null || slib_map.isEmpty()) {
			List<SalaryLib> slib = slib_mapper.selectByExample(null);
			slib_map = new HashMap<>();
			for( SalaryLib d:slib) {
				slib_map.put(d.getSalaryVersion(), d.getSalaryLibNo());
			}
		}
		
	}

	public int addAPerson( SourcePerson person) {
		init();

		PersonExample personExample = new PersonExample();
		Criteria c = personExample.or();
		if (person.getName() != null)
			c.andNameEqualTo(person.getName());
		if (person.getJobStartTime() != null)
			c.andJobStartTimeEqualTo(person.getJobStartTime());
		if (person.getJobEndTime() != null)
			c.andJobEndTimeEqualTo(person.getJobEndTime());
		if (person.getBirthTime() != null)
			c.andBirthTimeEqualTo(person.getBirthTime());
		personExample.or( c);
		long amount = person_mapper.countByExample( personExample);
		if( amount <= 0) {
			person_mapper.insertSelective( person.format(depts_map, sociaties_map, slib_map));
		}
		List<SourcePerson> selectByExample = person_mapper.selectAllForShow( personExample);
		int target_id = -1;
		if( selectByExample != null && selectByExample.size() > 0) {
			target_id = selectByExample.get(0).getSysNo();
		}
		return target_id;
	}
	
	

	public void updatePersonInfo(SourcePerson new_person) {
		init();
		PersonExample example = new PersonExample();
		Criteria c = example.createCriteria();
		c.andSysNoEqualTo( new_person.getSysNo());
		example.or(c);
		person_mapper.updateByExampleWithBLOBs(new_person.format(depts_map, sociaties_map, slib_map), example);
	}
	public int name2NoForDepts(String name) {
		return depts_map.get( name);
	}
	public int name2NoForSociaties(String name) {
		return sociaties_map.get( name);
	}
	public int name2NoForSlibs(String name) {
		return slib_map.get( name);
	}
}
