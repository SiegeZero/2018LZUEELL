package com.gsb.BasicObject.ServicesInterface;

import java.util.Calendar;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.SympathyAtv;

public interface SympathyAtvOperate {
	int addSympathyAtv( SympathyAtv newAtv);
	boolean delSympathyAtv( SympathyAtv targetAtv);
	boolean changeSympathyAtv( SympathyAtv changedAtv);
	
	List<SympathyAtv> getAllSympathyAtv();
	List<SympathyAtv> getAllSympathyAtvBetween(Calendar start_date, Calendar end_date);
}
