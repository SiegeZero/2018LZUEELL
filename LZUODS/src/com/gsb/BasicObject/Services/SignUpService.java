package com.gsb.BasicObject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBGDAO.StaffMapper;
import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.BasicObject.ServicesInterface.SignUpOperate;

@Service
public class SignUpService implements SignUpOperate{

	@Autowired
	StaffMapper staff_mapper;
	
	@Override
	public int insertNewStaff(Staff new_staff) {
		staff_mapper.insert( new_staff);
		return 0;
	}

	@Override
	public int deleteOldStaff(Staff new_staff, Staff curr_staff) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Staff> showAllStaffs(Staff curr_staff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyOldStaff(Staff new_staff, Staff curr_staff) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
