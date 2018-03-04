package com.gsb.BasicObject.Services;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gsb.BasicObject.MBGDAO.AtvInfoMapper;
import com.gsb.BasicObject.MBGDAO.SympathyAtvMapper;
import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample;
import com.gsb.BasicObject.MBGPOJO.SocietyExample;
import com.gsb.BasicObject.MBGPOJO.SympathyAtv;
import com.gsb.BasicObject.MBGPOJOBuilder.AtvInfoExampleBuilder;

public class EventService implements NormalAtvOperate, SympathyAtvOperate{

	@Autowired
	AtvInfoMapper atvinfo_mapper;
	
	@Autowired
	SympathyAtvMapper sympathy_mapper;
	
	@Override
	public int addSympathyAtv(SympathyAtv newAtv) {
		return 0;
	}

	@Override
	public boolean delSympathyAtv(SympathyAtv targetAtv) {
		return false;
	}

	@Override
	public boolean changeSympathyAtv(SympathyAtv changedAtv) {
		return false;
	}

	@Override
	public int addNormalAtv(AtvInfo newAtv) {
		int atv_no = -1;
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.equalToWithoutNo( newAtv).build();
		long target_amount = atvinfo_mapper.countByExample( example);
		if( 1 == target_amount) {
			atvinfo_mapper.insert( newAtv);
			List<AtvInfo> list = atvinfo_mapper.selectByExample( example);
			if( list != null && list.size() == 1) {
				atv_no = list.get(0).getAtvNo();
			}
		}
		return atv_no;
	}

	@Override
	public boolean delNormalAtv(AtvInfo targetAtv) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.equalToNo( targetAtv.getAtvNo()).build();
		boolean isDelSuccess = false;
		long target_amount = atvinfo_mapper.countByExample( example);
		if( 1 == target_amount) {
			atvinfo_mapper.deleteByPrimaryKey( targetAtv.getAtvNo());
			target_amount = atvinfo_mapper.countByExample( example);
			if( 0 == target_amount) {
				isDelSuccess = true;
			}
		}
		return isDelSuccess;
	}

	@Override
	public boolean changeNormalAtv(AtvInfo changedAtv) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.equalToNo( changedAtv.getAtvNo()).build();
		
		boolean isChangeSuccess = false;
		long target_amount = atvinfo_mapper.countByExample(example);
		if( 1 == target_amount) {
			atvinfo_mapper.updateByExample(changedAtv, example);
			isChangeSuccess = true;
		}
		return isChangeSuccess;
	}

	@Override
	public List<AtvInfo> getAllNormalAtv() {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.build();
		List<AtvInfo> list = atvinfo_mapper.selectByExample(example);
		return list;
	}

	@Override
	public List<AtvInfo> getAllNormalAtvBetween( Calendar start_date, Calendar end_date) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.startDateBetween( start_date, end_date).build();
		List<AtvInfo> list = atvinfo_mapper.selectByExample(example);
		return list;
	}

	@Override
	public List<AtvInfo> getAllNormalAtvBySociety( int societyNo) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.holdBySociety( societyNo).build();
		List<AtvInfo> list = atvinfo_mapper.selectByExample(example);
		return list;
	}

}
