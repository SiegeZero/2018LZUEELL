package com.gsb.BasicObject.ServicesInterface;

import java.util.Calendar;
import java.util.List;

import com.gsb.BasicObject.MBGPOJO.AtvInfo;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample;
import com.gsb.BasicObject.MBGPOJO.AtvInfoExample.Criteria;

public interface NormalAtvOperate {
	int addNormalAtv( AtvInfo newAtv);
	boolean delNormalAtv( AtvInfo targetAtv);
	boolean changeNormalAtv( AtvInfo changedAtv);
	
	List<AtvInfo> getAllNormalAtv();
	List<AtvInfo> getAllNormalAtvBetween( Calendar start_date, Calendar end_date);
	List<AtvInfo> getAllNormalAtvBySociety( int societyNo);
	
}
