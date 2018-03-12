package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Calendar;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.Sympathy;
import com.gsb.BasicObject.MBGPOJO.SympathyExample;
import com.gsb.BasicObject.MBGPOJO.SympathyExample.Criteria;

public class SympathyExampleBuilder {
	List<Criteria> cs = null;
	SympathyExample example = null;
	
	
	public SympathyExampleBuilder() {
		example = new SympathyExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	public SympathyExample build() {
		return example;
	}
	public SympathyExampleBuilder happenBetween( Calendar first_param, Calendar second_param) {
		for(Criteria c:cs) {
			c.andSympathyTimeBetween(first_param.getTime(), second_param.getTime());
		}
		return this;
	}
	public SympathyExampleBuilder withSysId( int sys_no) {
		for(Criteria c:cs) {
			c.andSysNoEqualTo( sys_no);
		}
		return this;
	}

	public SympathyExampleBuilder withAtvId( int atv_no) {
		for(Criteria c:cs) {
			c.andAcitivityNoEqualTo( atv_no);
		}
		return this;
	}
	public SympathyExampleBuilder equalTo( Sympathy newSym) {
		for(Criteria c:cs) {
			c.andSysNoEqualTo( newSym.getSysNo());
			c.andAcitivityNoEqualTo( newSym.getAcitivityNo());
			c.andSympathyTimeEqualTo( newSym.getSympathyTime());
		}
		return this;
	}
}
