package com.gsb.BasicObject.Services;

import com.gsb.BasicObject.MBGPOJO.Society;

public interface SocietyBasicOperate {
	int addSociety( Society newSociaty);
	boolean delSociety( Society targetSociaty);
	boolean changeInfo( Society changedSociaty);
}
