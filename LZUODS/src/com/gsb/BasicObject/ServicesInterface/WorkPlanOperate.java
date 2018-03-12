package com.gsb.BasicObject.ServicesInterface;

import com.gsb.BasicObject.MBGPOJO.WorkPlan;

public interface WorkPlanOperate {
	boolean addPlan( WorkPlan newPlan);
	boolean delPlan( WorkPlan targetPlan);
	boolean changePlan( WorkPlan changedPlan);
}
