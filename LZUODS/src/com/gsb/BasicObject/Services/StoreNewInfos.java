package com.gsb.BasicObject.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBG.AtvInfo;
import com.gsb.BasicObject.MBG.SourcePerson;
import com.gsb.BasicObject.MBGDAO.AtvInfoMapper;
import com.gsb.BasicObject.MBGDAO.PersonMapper;

@Service
public class StoreNewInfos {
	@Autowired
	AtvInfoMapper atv_mapper;
	
	public boolean storeAtvInfo( AtvInfo record) {
		atv_mapper.insert(record);
		return true;
	}
	
	@Autowired
	PersonMapper person_mapper;
	
//	public boolean storeBasicInfo( SourcePerson record) {
//		person_mapper.insertSelective( record);
//		return true;
//	}
}
