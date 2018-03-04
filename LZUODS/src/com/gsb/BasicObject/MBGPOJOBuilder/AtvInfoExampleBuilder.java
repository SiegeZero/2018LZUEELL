package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Calendar;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample.Criteria;

public class AtvInfoExampleBuilder {
	List<Criteria> cs = null;
	AtvInfoExample example = null;
	
	
	public AtvInfoExampleBuilder() {
		example = new AtvInfoExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	public AtvInfoExample build() {
		return example;
	}
	public AtvInfoExampleBuilder startDateBetween( Calendar first_param, Calendar second_param) {
		for(Criteria c:cs) {
			c.andAtvStartDateBetween(first_param.getTime(), second_param.getTime());
		}
		return this;
	}
	public AtvInfoExampleBuilder endDateBetween( Calendar first_param, Calendar second_param) {
		for(Criteria c:cs) {
			c.andAtvEndDateBetween(first_param.getTime(), second_param.getTime());
		}
		return this;
	}
	public AtvInfoExampleBuilder holdBySociety( int societyNo) {
		for(Criteria c:cs) {
			c.andLeadSocietyNoEqualTo( societyNo);
		}
		return this;
	}
	public AtvInfoExampleBuilder equalToWithoutNo( AtvInfo target) {
		for(Criteria c:cs) {
			c.andAtvTopicEqualTo( target.getAtvTopic());
			c.andAtvStartDateEqualTo( target.getAtvStartDate());
			c.andAtvEndDateEqualTo( target.getAtvEndDate());
		}
		return this;
	}
	public AtvInfoExampleBuilder equalToNo( int act_no) {
		for(Criteria c:cs) {
			c.andAtvNoEqualTo( act_no);
		}
		return this;
	}
	
	
	
}

