package com.gsb.BasicObject.Services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.Beans.SympathyWithName;
import com.gsb.BasicObject.MBGDAO.AtvInfoMapper;
import com.gsb.BasicObject.MBGDAO.SympathyAtvMapper;
import com.gsb.BasicObject.MBGDAO.SympathyMapper;
import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample;
import com.gsb.BasicObject.MBGPOJO.SocietyExample;
import com.gsb.BasicObject.MBGPOJO.Sympathy;
import com.gsb.BasicObject.MBGPOJO.SympathyAtv;
import com.gsb.BasicObject.MBGPOJOBuilder.AtvInfoExampleBuilder;
import com.gsb.BasicObject.MBGPOJOBuilder.SympathyAtvExampleBuilder;
import com.gsb.BasicObject.MBGPOJOBuilder.SympathyExampleBuilder;
import com.gsb.BasicObject.ServicesInterface.NormalAtvOperate;
import com.gsb.BasicObject.ServicesInterface.SympathyAtvOperate;
import com.gsb.BasicObject.ServicesInterface.SympathyOperate;

@Service
public class EventService implements NormalAtvOperate, SympathyAtvOperate, SympathyOperate{

	@Autowired
	AtvInfoMapper atvinfo_mapper;
	
	@Autowired
	SympathyAtvMapper sympathy_atv_mapper;
	
	@Autowired
	SympathyMapper sympathy_mapper;
	
	@Override
	public int addSympathyAtv(SympathyAtv newAtv) {
		int atv_no = -1;
		SympathyAtvExampleBuilder builder = new SympathyAtvExampleBuilder();
		builder.equalTo( newAtv);
		if( 0 == sympathy_atv_mapper.countByExample( builder.build())) {
			sympathy_atv_mapper.insert(newAtv);
			List<SympathyAtv> list = sympathy_atv_mapper.selectByExample( builder.build());
			if( list != null && list.size() == 1) {
				atv_no = list.get(0).getActivityNo();
			}
		}
		return atv_no;
	}

	@Override
	public boolean delSympathyAtv(SympathyAtv targetAtv) {
		boolean delSuccess = false;
		SympathyAtvExampleBuilder builder = new SympathyAtvExampleBuilder();
		builder.equalTo(targetAtv);
		if( 1 == sympathy_atv_mapper.countByExample( builder.build())) {
			sympathy_atv_mapper.deleteByExample( builder.build());
			if( 0 == sympathy_atv_mapper.countByExample( builder.build())
					&& this.delAllSympathy( targetAtv.getActivityNo())) {
				delSuccess = true;
			}
		}
		return delSuccess;
	}

	@Override
	public boolean changeSympathyAtv(SympathyAtv changedAtv) {
		boolean changeSuccess = false;
		SympathyAtvExampleBuilder builder = new SympathyAtvExampleBuilder();
		builder.equalTo(changedAtv);
		if( 1 == sympathy_atv_mapper.countByExample( builder.build())) {
			sympathy_atv_mapper.updateByExample( changedAtv, builder.build());
			changeSuccess = true;
		}
		return changeSuccess;
	}

	@Override
	public int addNormalAtv(AtvInfo newAtv) {
		int atv_no = -1;
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		builder.equalToWithoutNo( newAtv);
		if( 1 == atvinfo_mapper.countByExample( builder.build())) {
			atvinfo_mapper.insert( newAtv);
			List<AtvInfo> list = atvinfo_mapper.selectByExample( builder.build());
			if( list != null && list.size() == 1) {
				atv_no = list.get(0).getAtvNo();
			}
		}
		return atv_no;
	}

	@Override
	public boolean delNormalAtv(AtvInfo targetAtv) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		builder.equalToNo( targetAtv.getAtvNo());
		boolean isDelSuccess = false;
		if( 1 == atvinfo_mapper.countByExample( builder.build())) {
			atvinfo_mapper.deleteByPrimaryKey( targetAtv.getAtvNo());
			if( 0 == atvinfo_mapper.countByExample( builder.build())) {
				isDelSuccess = true;
			}
		}
		return isDelSuccess;
	}

	@Override
	public boolean changeNormalAtv(AtvInfo changedAtv) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		builder.equalToNo( changedAtv.getAtvNo());
		boolean isChangeSuccess = false;
		if( 1 == atvinfo_mapper.countByExample( builder.build())) {
			atvinfo_mapper.updateByExample(changedAtv, builder.build());
			isChangeSuccess = true;
		}
		return isChangeSuccess;
	}

	@Override
	public List<AtvInfo> getAllNormalAtv() {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		List<AtvInfo> list = atvinfo_mapper.selectByExample(builder.build());
		return list;
	}

	@Override
	public List<AtvInfo> getAllNormalAtvBetween( Calendar start_date, Calendar end_date) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		builder.startDateBetween( start_date, end_date);
		List<AtvInfo> list = atvinfo_mapper.selectByExample( builder.build());
		return list;
	}

	@Override
	public List<AtvInfo> getAllNormalAtvBySociety( int societyNo) {
		AtvInfoExampleBuilder builder = new AtvInfoExampleBuilder();
		AtvInfoExample example = builder.holdBySociety( societyNo).build();
		List<AtvInfo> list = atvinfo_mapper.selectByExample(example);
		return list;
	}

	@Override
	public boolean addSympathy(Sympathy newSym) {
		boolean addSuccess = false;
		SympathyExampleBuilder builder = new SympathyExampleBuilder();
		builder.equalTo(newSym);
		if( 0 == sympathy_mapper.countByExample( builder.build())) {
			sympathy_mapper.insert(newSym);
			if( 1 == sympathy_mapper.countByExample( builder.build())) {
				addSuccess = true;
			}
		}
		return addSuccess;
	}

	@Override
	public boolean delSympathy(Sympathy targetSym) {
		boolean delSuccess = false;
		SympathyExampleBuilder builder = new SympathyExampleBuilder();
		builder.equalTo(targetSym);
		if( 1 == sympathy_mapper.countByExample( builder.build())) {
			sympathy_mapper.deleteByExample( builder.build());
			if( 0 == sympathy_mapper.countByExample( builder.build())) {
				delSuccess = true;
			}
		}
		return delSuccess;
	}

	@Override
	public boolean changeSympathy(Sympathy changedSym) {
		boolean changeSuccess = false;
		SympathyExampleBuilder builder = new SympathyExampleBuilder();
		builder.equalTo(changedSym);
		if( 1 == sympathy_mapper.countByExample( builder.build())) {
			sympathy_mapper.updateByExample( changedSym, builder.build());
			changeSuccess = true;
		}
		return changeSuccess;
	}

	@Override
	public boolean delAllSympathy(int atvNo) {
		boolean delSuccess = false;
		SympathyExampleBuilder builder = new SympathyExampleBuilder();
		builder.withAtvId(atvNo);
		if( sympathy_mapper.countByExample( builder.build()) >= 0) {
			sympathy_mapper.deleteByExample( builder.build());
			if( 0 == sympathy_mapper.countByExample( builder.build())) {
				delSuccess = true;
			}
		}
		return delSuccess;
	}

	@Override
	public List<SympathyAtv> getAllSympathyAtv() {
		SympathyAtvExampleBuilder builder = new SympathyAtvExampleBuilder();
		return sympathy_atv_mapper.selectByExampleWithBLOBs(builder.build());
	}

	@Override
	public List<SympathyAtv> getAllSympathyAtvBetween( Calendar start_date, Calendar end_date) {
		SympathyAtvExampleBuilder builder = new SympathyAtvExampleBuilder();
		builder.happenBetween( start_date, end_date);
		return sympathy_atv_mapper.selectByExampleWithBLOBs(builder.build());
	}
	
	@Override
	public List<SympathyWithName> getAllSympathyWithAtvId( int atv_no) {
		SympathyExampleBuilder builder = new SympathyExampleBuilder();
		builder.withAtvId(atv_no);
		return sympathy_mapper.selectByExample(builder.build());
	}
	
	public List<Map<SympathyAtv, List<SympathyWithName>>> showAllAboutSympathyAtv( List<SympathyAtv> atv_list) {
		List<Map<SympathyAtv, List<SympathyWithName>>> results = new ArrayList<>();
		if( null == atv_list) {
			atv_list = getAllSympathyAtv();
		}
		for( SympathyAtv tmp: atv_list) {
			Map<SympathyAtv, List<SympathyWithName>> e = new HashMap<>();
			e.put(tmp, getAllSympathyWithAtvId( tmp.getActivityNo()));
			results.add(e);
		}
		return results;
	}

}
