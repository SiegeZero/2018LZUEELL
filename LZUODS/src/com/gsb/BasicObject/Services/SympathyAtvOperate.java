package com.gsb.BasicObject.Services;

import com.gsb.BasicObject.MBGPOJO.SympathyAtv;

public interface SympathyAtvOperate {
	int addSympathyAtv( SympathyAtv newAtv);
	boolean delSympathyAtv( SympathyAtv targetAtv);
	boolean changeSympathyAtv( SympathyAtv changedAtv);
}
