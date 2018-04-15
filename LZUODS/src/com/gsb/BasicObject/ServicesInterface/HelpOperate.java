package com.gsb.BasicObject.ServicesInterface;

import com.gsb.BasicObject.MBGPOJO.HelpRecord;

public interface HelpOperate {
	boolean addHelpRecord( HelpRecord newRecord);
	boolean delHelpRecord( HelpRecord targetRecord);
	boolean changeHelpRecord( HelpRecord changedRecord);
}
