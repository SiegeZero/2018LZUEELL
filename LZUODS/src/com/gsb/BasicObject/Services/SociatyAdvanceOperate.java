package com.gsb.BasicObject.Services;

import java.util.List;

import com.gsb.BasicObject.MBGPOJO.Sociaty;
import com.gsb.BasicObject.MBGPOJO.SociatyExample;

public interface SociatyAdvanceOperate {
	SociatyExample getNewSociatyExample();
	List<String> getAllSociatiesName( SociatyExample example);
	Sociaty getInfoByExample( SociatyExample example);
}
