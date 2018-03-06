package com.gsb.BasicObject.MBGPOJOBuilder;

import java.util.Calendar;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.MeetingRoomExample;
import com.gsb.BasicObject.MBGPOJO.MeetingRoomExample.Criteria;

public class MeetingRoomExampleBuilder {
	List<Criteria> cs = null;
	MeetingRoomExample example = null;
	public MeetingRoomExampleBuilder() {
		example = new MeetingRoomExample();
		example.createCriteria();
		cs = example.getOredCriteria();
	}
	public MeetingRoomExample build() {
		return example;
	}
	
	public MeetingRoomExampleBuilder roomNameLike( String roomName) {
		for( Criteria c: cs) {
			c.andPlaceLike("%" + roomName + "%");
		}
		return this;
	}
	
	public MeetingRoomExampleBuilder meetingDuring( Calendar begin, Calendar end) {
		for( Criteria c: cs) {
			c.andBeginTimeLessThanOrEqualTo( end.getTime());
			c.andEndTimeGreaterThanOrEqualTo( begin.getTime());
		}
		return this;
	}
	public MeetingRoomExampleBuilder holdBySociety( int society_no) {
		for( Criteria c: cs) {
			c.andSocietyNoEqualTo( society_no);
		}
		return this;
	}
	
	
	
}
