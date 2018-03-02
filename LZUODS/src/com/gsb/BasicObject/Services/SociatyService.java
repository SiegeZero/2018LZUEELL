package com.gsb.BasicObject.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBGDAO.SociatyMapper;
import com.gsb.BasicObject.MBGPOJO.Sociaty;
import com.gsb.BasicObject.MBGPOJO.SociatyExample;
import com.gsb.BasicObject.MBGPOJO.SociatyExample.Criteria;

@Service
public class SociatyService implements SociatyBasicOperate, SociatyAdvanceOperate {

	@Autowired
	SociatyMapper sociaty_mapper;
	
	@Override
	public int addSociaty(Sociaty newSociaty) {

		SociatyExample example = getBasicExample(newSociaty);
		
		int sociaty_no = -1;
		long target_amount = sociaty_mapper.countByExample(example);
		if( target_amount == 0) {
			sociaty_mapper.insert( newSociaty);
			List<Sociaty> list = sociaty_mapper.selectByExample(example );
			if( list != null && 1 == list.size()) {
				sociaty_no = list.get(0).getSociatyNo();
			}
		}
		return sociaty_no;
	}

	private SociatyExample getBasicExample(Sociaty newSociaty) {
		SociatyExample example = new SociatyExample();
		Criteria c = example.or();
		c.andSociatyNameEqualTo( newSociaty.getSociatyName());
		c.andSociatyLeaderEqualTo( newSociaty.getSociatyLeader());
		return example;
	}

	@Override
	public boolean delSociaty(Sociaty targetSociaty) {
		SociatyExample example = getBasicExample(targetSociaty);
		
		boolean isDelSuccess = false;
		long target_amount = sociaty_mapper.countByExample(example);
		if( 1 == target_amount) {
			sociaty_mapper.deleteByPrimaryKey( targetSociaty.getSociatyNo());
			target_amount = sociaty_mapper.countByExample(example );
			if( 0 == target_amount) {
				isDelSuccess = true;
			}
		}
		return isDelSuccess;
	}

	@Override
	public boolean changeInfo(Sociaty changedSociaty) {
		SociatyExample example = getBasicExample(changedSociaty);
		
		boolean isChangeSuccess = false;
		long target_amount = sociaty_mapper.countByExample(example);
		if( 1 == target_amount) {
			sociaty_mapper.updateByExampleWithBLOBs(changedSociaty, example);
			isChangeSuccess = true;
		}
		return isChangeSuccess;
	}

	@Override
	public SociatyExample getNewSociatyExample() {
		SociatyExample example = new SociatyExample();
		return example;
	}

	@Override
	public List<String> getAllSociatiesName( SociatyExample example) {
		List<Sociaty> list = sociaty_mapper.selectByExample( example);
		List<String> nameList = new ArrayList<>();
		for( Sociaty s:list) {
			nameList.add(s.getSociatyName());
		}
		return nameList;
	}

	@Override
	public Sociaty getInfoByExample(SociatyExample example) {
		List<Sociaty> list = sociaty_mapper.selectByExampleWithBLOBs(example);
		Sociaty target = null;
		if( list != null && 1 == list.size()) {
			target = list.get(0);
		}
		return target;
	}

	
}
