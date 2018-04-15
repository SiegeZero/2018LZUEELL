package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.List;

import com.gsb.BasicObject.MBGPOJO.HelpRecord;
import com.gsb.BasicObject.MBGPOJO.HelpRecordExample;
import com.gsb.BasicObject.MBGPOJO.HelpRecordExample.Criteria;

public class HelpRecordExampleBuilder {
	List<Criteria> cs = null;
	HelpRecordExample example = null;
	
	
	public HelpRecordExampleBuilder() {
		example = new HelpRecordExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	
	public HelpRecordExample build() {
		return example;
	}


	public HelpRecordExampleBuilder equalTo(HelpRecord newRecord) {
		for(Criteria c:cs) {
			c.andHelpTimeEqualTo( newRecord.getHelpTime());
			c.andSysNoEqualTo( newRecord.getSysNo());
		}
		return this;
	}

}
