package com.gsb.BasicObject.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBGDAO.SocietyMapper;
import com.gsb.BasicObject.MBGPOJO.Society;
import com.gsb.BasicObject.MBGPOJO.SocietyExample;
import com.gsb.BasicObject.MBGPOJO.SocietyExample.Criteria;
import com.gsb.BasicObject.ServicesInterface.SocietyAdvanceOperate;
import com.gsb.BasicObject.ServicesInterface.SocietyBasicOperate;

@Service
public class SocietyService implements SocietyBasicOperate, SocietyAdvanceOperate {

	@Autowired
	SocietyMapper society_mapper;
	
	@Override
	public int addSociety(Society newSociety) {

		SocietyExample example = getBasicExample(newSociety);
		
		int society_no = -1;
		long target_amount = society_mapper.countByExample(example);
		if( target_amount == 0) {
			society_mapper.insert( newSociety);
			List<Society> list = society_mapper.selectByExample(example );
			if( list != null && 1 == list.size()) {
				society_no = list.get(0).getSocietyNo();
			}
		}
		return society_no;
	}

	private SocietyExample getBasicExample(Society newSociety) {
		SocietyExample example = new SocietyExample();
		Criteria c = example.or();
		c.andSocietyNameEqualTo( newSociety.getSocietyName());
		c.andSocietyLeaderEqualTo( newSociety.getSocietyLeader());
		return example;
	}

	@Override
	public boolean delSociety(Society targetSociety) {
		SocietyExample example = getBasicExample(targetSociety);
		
		boolean isDelSuccess = false;
		long target_amount = society_mapper.countByExample(example);
		if( 1 == target_amount) {
			society_mapper.deleteByPrimaryKey( targetSociety.getSocietyNo());
			target_amount = society_mapper.countByExample(example );
			if( 0 == target_amount) {
				isDelSuccess = true;
			}
		}
		return isDelSuccess;
	}

	@Override
	public boolean changeInfo(Society changedSociety) {
		SocietyExample example = getBasicExample(changedSociety);
		
		boolean isChangeSuccess = false;
		long target_amount = society_mapper.countByExample(example);
		if( 1 == target_amount) {
			society_mapper.updateByExampleWithBLOBs(changedSociety, example);
			isChangeSuccess = true;
		}
		return isChangeSuccess;
	}

	@Override
	public SocietyExample getNewSocietyExample() {
		SocietyExample example = new SocietyExample();
		return example;
	}

	@Override
	public List<String> getAllSocietiesName() {
		List<Society> list = society_mapper.selectByExample( getNewSocietyExample());
		List<String> nameList = new ArrayList<>();
		for( Society s:list) {
			nameList.add(s.getSocietyName());
		}
		return nameList;
	}
	
	
	

	@Override
	public Society getInfoByExample(SocietyExample example) {
		List<Society> list = society_mapper.selectByExampleWithBLOBs(example);
		Society target = null;
		if( list != null && 1 == list.size()) {
			target = list.get(0);
		}
		return target;
	}

	@Override
	public List<Society> getAllSocieties() {
		return society_mapper.selectByExample( null);
	}

	
}
