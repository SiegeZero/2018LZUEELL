package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Date;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.Notification;
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
	
	public NotificationExample build() {
		return example;
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

	public NotifyExampleBuilder publishBy(int publisher_no) {
		for( Criteria c: cs) {
			c.andPublisherNoEqualTo( publisher_no);
		}
		return this;
	}

	public NotifyExampleBuilder titleLike(String titleLike) {
		for( Criteria c: cs) {
			c.andTitleLike("%" + titleLike + "%");
		}
		return this;
	}
	
	public NotifyExampleBuilder equalTo( Notification n, boolean withId) {
		for( Criteria c: cs) {
			if( withId) {
				c.andNotificationNoEqualTo( n.getNotificationNo());
			} else {
				c.andPublisherNoEqualTo( n.getPublisherNo());
				c.andPublishTimeEqualTo( n.getPublishTime());
				c.andTitleEqualTo( n.getTitle());
				c.andSocietyNoEqualTo( n.getSocietyNo());
			}
		}
		return this;
	}

}
