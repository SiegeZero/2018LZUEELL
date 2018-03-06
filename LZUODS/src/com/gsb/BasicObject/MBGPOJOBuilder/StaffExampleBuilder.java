package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.List;

import com.gsb.BasicObject.MBGPOJO.StaffExample;
import com.gsb.BasicObject.MBGPOJO.StaffExample.Criteria;;

public class StaffExampleBuilder {
	StaffExample example;
	List<Criteria> cs;
	public StaffExampleBuilder() {
		example = new StaffExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}

	public StaffExampleBuilder accountEqualTo( String account) {
		for( Criteria c:cs) {
			c.andAccountEqualTo( account);
		}
		return this;
	}
	
	public StaffExample build() {
		return example;
	}
}
