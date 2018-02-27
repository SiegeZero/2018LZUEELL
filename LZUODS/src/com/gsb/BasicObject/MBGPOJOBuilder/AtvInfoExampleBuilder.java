package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Calendar;

import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample.Criteria;

public class AtvInfoExampleBuilder {
	Criteria c = null;
	AtvInfoExample example = null;
	
	
	public AtvInfoExampleBuilder() {
		example = new AtvInfoExample();
		c = example.or();
	}
	public AtvInfoExample build() {
		return example;
	}
	public AtvInfoExampleBuilder startDateBetween( Calendar first_param, Calendar second_param) {
		c.andAtvStartDateBetween(first_param.getTime(), second_param.getTime());
		return this;
	}
	public AtvInfoExampleBuilder endDateBetween( Calendar first_param, Calendar second_param) {
		c.andAtvEndDateBetween(first_param.getTime(), second_param.getTime());
		return this;
	}
	public AtvInfoExampleBuilder holdBySociaty( int sociatyNo) {
		c.andLeadSociatyNoEqualTo( sociatyNo);
		return this;
	}
	public AtvInfoExampleBuilder equalToWithoutNo( AtvInfo target) {
		c.andAtvTopicEqualTo( target.getAtvTopic());
		c.andAtvStartDateEqualTo( target.getAtvStartDate());
		c.andAtvEndDateEqualTo( target.getAtvEndDate());
		return this;
	}
	
	
}

