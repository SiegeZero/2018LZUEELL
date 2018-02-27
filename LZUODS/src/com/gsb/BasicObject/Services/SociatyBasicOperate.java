package com.gsb.BasicObject.Services;

import com.gsb.BasicObject.MBGPOJO.Sociaty;

public interface SociatyBasicOperate {
	int addSociaty( Sociaty newSociaty);
	boolean delSociaty( Sociaty targetSociaty);
	boolean changeInfo( Sociaty changedSociaty);
}
