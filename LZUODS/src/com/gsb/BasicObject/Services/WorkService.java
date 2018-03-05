package com.gsb.BasicObject.Services;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBGDAO.NotificationMapper;
import com.gsb.BasicObject.MBGDAO.WorkPlanMapper;
import com.gsb.BasicObject.MBGPOJO.Notification;
import com.gsb.BasicObject.MBGPOJO.NotificationExample;
import com.gsb.BasicObject.MBGPOJO.WorkPlan;
import com.gsb.BasicObject.MBGPOJO.WorkPlanExample;
import com.gsb.BasicObject.MBGPOJOBuilder.NotifyExampleBuilder;
import com.gsb.BasicObject.MBGPOJOBuilder.WorkPlanExampleBuilder;

@Service
public class WorkService implements WorkPlanOperate, NotifyOperate, FinalJudge, MeetingRoomOperate{

	
	@Autowired
	WorkPlanMapper workplan_mapper;
	
	@Override
	public boolean addPlan(WorkPlan newPlan) {
		WorkPlanExampleBuilder builder = new WorkPlanExampleBuilder();
		WorkPlanExample example = builder.holdByStaff(newPlan.getSysNo())
				.titleEqualTo( newPlan.getTitle())
				.workplanHappenAt( newPlan.getHappenDate())
				.build();
		boolean isAddSuccess = false;
		long target_amount = workplan_mapper.countByExample(example);
		if( target_amount == 0) {
			workplan_mapper.insert( newPlan);
			isAddSuccess = true;
		}
		return isAddSuccess;
	}

	@Override
	public boolean delPlan(WorkPlan targetPlan) {
		WorkPlanExampleBuilder builder = new WorkPlanExampleBuilder();
		WorkPlanExample example = builder.holdByStaff(targetPlan.getSysNo())
				.titleEqualTo( targetPlan.getTitle())
				.workplanHappenAt( targetPlan.getHappenDate())
				.build();
		boolean isDelSuccess = false;
		long target_amount = workplan_mapper.countByExample(example);
		if( 1 == target_amount) {
			workplan_mapper.deleteByExample(example);
			target_amount = workplan_mapper.countByExample(example);
			if( 0 == target_amount) {
				isDelSuccess = true;
			}
		}
		return isDelSuccess;
	}

	@Override
	public boolean changePlan(WorkPlan changedPlan) {
		WorkPlanExampleBuilder builder = new WorkPlanExampleBuilder();
		WorkPlanExample example = builder.holdByStaff(changedPlan.getSysNo())
				.titleEqualTo( changedPlan.getTitle())
				.workplanHappenAt( changedPlan.getHappenDate())
				.build();
		boolean isChangeSuccess = false;
		long target_amount = workplan_mapper.countByExample(example);
		if( 1 == target_amount) {
			workplan_mapper.updateByExampleWithBLOBs(changedPlan, example);
			isChangeSuccess = true;
		}
		return isChangeSuccess;
	}

	@Autowired
	NotificationMapper notify_mapper;
	
	@Override
	public int addNotification(Notification newNotification) {
		NotifyExampleBuilder builder = new NotifyExampleBuilder();
		NotificationExample example = builder.equalTo( newNotification, false).build();
		int notify_id = -1;
		long target_amount = notify_mapper.countByExample(example);
		if( 0 == target_amount) {
			notify_mapper.insert( newNotification);
			List<Notification> list = notify_mapper.selectByExampleWithBLOBs( example);
			if( list != null && list.size() == 1) {
				notify_id = list.get(0).getNotificationNo();
			}
		}
		return notify_id;
	}

	@Override
	public boolean delNotification(Notification targetNotification) {
		boolean isDelSuccess = false;
		NotifyExampleBuilder builder = new NotifyExampleBuilder();
		NotificationExample example = builder.equalTo( targetNotification, true).build();
		long target_amount = notify_mapper.countByExample(example);
		if( 1 == target_amount) {
			notify_mapper.deleteByPrimaryKey(targetNotification.getNotificationNo());
			target_amount = notify_mapper.countByExample(example);
			if( 0 == target_amount) {
				isDelSuccess = true;
			}
		}
		return isDelSuccess;
	}

	@Override
	public boolean changeNotification(Notification changeNotification) {
		boolean isChangeSuccess = false;
		NotifyExampleBuilder builder = new NotifyExampleBuilder();
		NotificationExample example = builder.equalTo( changeNotification, true).build();
		long target_amount = notify_mapper.countByExample(example);
		if( 1 == target_amount) {
			notify_mapper.updateByExampleWithBLOBs( changeNotification, example);
			isChangeSuccess = true;
		}
		return isChangeSuccess;
	}

	public List<Notification> showAllNotification() {
		return showNotification( -1, null, null, -1);
	}

	public List<Notification> showNotificationOnDate( Date date) {
		return showNotification( -1, null, date, -1);
	}
	
	public List<Notification> shownotificationHoldBy( int publisher_no) {
		return showNotification( publisher_no, null, null, -1);
	}

	public List<Notification> shownotificationBySociety( int society_no) {
		return showNotification( -1, null, null, society_no);
	}
	
	public List<Notification> showNotification( int publisher_no, String title_like, Date publish_time, int society_no) {
		NotifyExampleBuilder builder = new NotifyExampleBuilder();
		if( publisher_no != -1) {
			builder.publishBy( publisher_no);
		}
		if( society_no != -1) {
			builder.holdBySociety(society_no);
		}
		if( title_like != null && !title_like.equals("")) {
			builder.titleLike(title_like);
		}
		if( publish_time != null) {
			builder.publishOn( publish_time);
		}
		return notify_mapper.selectByExampleWithBLOBs( builder.build());
	}
	
}
