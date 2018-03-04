package com.gsb.BasicObject.Services;

import com.gsb.BasicObject.MBGPOJO.Notification;

public interface NotifyOperate {
	int addNotification( Notification newNotification);
	boolean delNotification( Notification targetNotification);
	boolean changeNotification( Notification changeNotification);
}
