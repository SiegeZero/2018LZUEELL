package com.gsb.BasicObject.Services;

import java.util.List;

import com.gsb.BasicObject.MBGPOJO.Society;
import com.gsb.BasicObject.MBGPOJO.SocietyExample;

public interface SocietyAdvanceOperate {
	SocietyExample getNewSocietyExample();
	List<String> getAllSocietiesName();
	Society getInfoByExample( SocietyExample example);
}
