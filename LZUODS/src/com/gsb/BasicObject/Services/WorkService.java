package com.gsb.BasicObject.Services;


import org.springframework.beans.factory.annotation.Autowired;

import com.gsb.BasicObject.MBGDAO.WorkPlanMapper;
import com.gsb.BasicObject.MBGPOJO.Notification;
import com.gsb.BasicObject.MBGPOJO.WorkPlan;
import com.gsb.BasicObject.MBGPOJO.WorkPlanExample;
import com.gsb.BasicObject.MBGPOJOBuilder.WorkPlanExampleBuilder;

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

	@Override
	public int addNotification(Notification newNotification) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delNotification(Notification targetNotification) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeNotification(Notification changeNotification) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
