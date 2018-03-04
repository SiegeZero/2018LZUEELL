package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Calendar;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.SympathyAtvExample;
import com.gsb.BasicObject.MBGPOJO.SympathyAtvExample.Criteria;

public class SympathyAtvExampleBuilder {
	List<Criteria> cs = null;
	SympathyAtvExample example = null;
	
	
	public SympathyAtvExampleBuilder() {
		example = new SympathyAtvExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	public SympathyAtvExample build() {
		return example;
	}
	public SympathyAtvExampleBuilder happenBetween( Calendar first_param, Calendar second_param) {
		for(Criteria c:cs) {
			c.andSympathyTimeBetween(first_param.getTime(), second_param.getTime());
		}
		return this;
	}
	public SympathyAtvExampleBuilder withId( int act_no) {
		for(Criteria c:cs) {
			c.andActivityNoEqualTo( act_no);
		}
		return this;
	}
}
