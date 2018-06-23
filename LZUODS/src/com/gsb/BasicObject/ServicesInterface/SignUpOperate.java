package com.gsb.BasicObject.ServicesInterface;

import java.util.List;

import com.gsb.BasicObject.MBGPOJO.Staff;

public interface SignUpOperate {

	int insertNewStaff(Staff new_staff);
	int deleteOldStaff(Staff new_staff, Staff curr_staff);
	List<Staff> showAllStaffs( Staff curr_staff);
	int modifyOldStaff( Staff new_staff, Staff curr_staff);
}
