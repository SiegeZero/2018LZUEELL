package com.gsb.BasicObject.Services;

import java.util.List;

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
	
	public List<SourcePerson> showRecordWith( Integer id) {
		return person_mapper.selectAllForShow();
	}
}
