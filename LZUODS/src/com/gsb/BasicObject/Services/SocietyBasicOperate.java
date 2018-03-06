package com.gsb.BasicObject.Services;

import com.gsb.BasicObject.MBGPOJO.Society;

public interface SocietyBasicOperate {
	int addSociety( Society newSociety);
	boolean delSociety( Society targetSociety);
	boolean changeInfo( Society changedSociety);
}
