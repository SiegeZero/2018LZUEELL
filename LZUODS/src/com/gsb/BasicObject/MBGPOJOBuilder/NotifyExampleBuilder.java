package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Date;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.NotificationExample;
import com.gsb.BasicObject.MBGPOJO.NotificationExample.Criteria;

public class NotifyExampleBuilder {
	List<Criteria> cs = null;
	NotificationExample example = null;
	
	public NotifyExampleBuilder() {
		example = new NotificationExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	
	public NotifyExampleBuilder publishOn( Date publish_time) {
		for( Criteria c: cs) {
			c.andPublishTimeEqualTo( publish_time);
		}
		return this;
	}
	
	public NotifyExampleBuilder holdBySociety( int society_no) {
		for( Criteria c: cs) {
			c.andSocietyNoEqualTo( society_no);
		}
		return this;
	}
	
}
