package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.WorkPlanExample.Criteria;
import com.gsb.BasicObject.MBGPOJO.WorkPlanExample;

public class WorkPlanExampleBuilder {

	List<Criteria> cs = null;
	WorkPlanExample example = null;
	public WorkPlanExampleBuilder() {
		example = new WorkPlanExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	public WorkPlanExample build() {
		return example;
	}
	
	public WorkPlanExampleBuilder statusIs( int status) {
		for( Criteria c: cs) {
			c.andStatusEqualTo( status);
		}
		return this;
	}
	
	public WorkPlanExampleBuilder workplanHappenAt( Date happen) {
		for( Criteria c: cs) {
			c.andHappenDateEqualTo( happen);
		}
		return this;
	}
	public WorkPlanExampleBuilder holdByStaff( int sys_no) {
		for( Criteria c: cs) {
			c.andSysNoEqualTo( sys_no);
		}
		return this;
	}
	
	public WorkPlanExampleBuilder titleEqualTo( String title) {
		for( Criteria c: cs) {
			c.andTitleEqualTo( title);
		}
		return this;
	}
	
}
