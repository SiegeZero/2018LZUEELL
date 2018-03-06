package com.gsb.BasicObject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBGDAO.StaffMapper;
import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.BasicObject.MBGPOJOBuilder.StaffExampleBuilder;
import com.gsb.Utils.Eypt;

@Service
public class AuthAccount {
	
	@Autowired
	StaffMapper staff_mapper;
	
	public Staff access( Staff source) {
		StaffExampleBuilder builder = new StaffExampleBuilder();
		List<Staff> list = staff_mapper.selectByExample( builder.accountEqualTo(source.getAccount()).build());
		if( list != null && 1 == list.size()) {
			Staff db_staff = list.get(0);
			String eypted_from_db = Eypt.md5( db_staff.getPassword());
			if( source.getPassword().equals(eypted_from_db)) {
				source.setFinalGoal( db_staff.getFinalGoal());;
				source.setGender( db_staff.getGender());
				source.setSysLevel( db_staff.getSysLevel());
				source.setSysNo( db_staff.getSysNo());
				return source;
			} 
		} 
		return null;
	}
}
