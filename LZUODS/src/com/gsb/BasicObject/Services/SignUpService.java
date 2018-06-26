package com.gsb.BasicObject.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.BasicObject.MBGDAO.StaffMapper;
import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.BasicObject.MBGPOJO.StaffExample;
import com.gsb.BasicObject.MBGPOJOBuilder.StaffExampleBuilder;
import com.gsb.BasicObject.ServicesInterface.SignUpOperate;

@Service
public class SignUpService implements SignUpOperate{

	@Autowired
	StaffMapper staff_mapper;
	
	@Override
	public int insertNewStaff(Staff new_staff) {
		int sys_no = -1;
		new_staff.setSysLevel("z");
		StaffExampleBuilder builder = new StaffExampleBuilder();
		builder.accountEqualTo( new_staff.getAccount());
		StaffExample example = builder.build();
		long counter = staff_mapper.countByExample(example);
		if( 0 == counter) {
			staff_mapper.insert( new_staff);
			List<Staff> list = staff_mapper.selectByExample(example);
			if( 1 == list.size()) {
				sys_no = list.get(0).getSysNo();
			}
		}
		return sys_no;
	}

	@Override
	public int deleteOldStaff(Staff new_staff, Staff curr_staff) {
		int result = 0;
		if( !"abcde".contains(curr_staff.getSysLevel())) {
			result = -1;
			return result;
		}
		StaffExampleBuilder builder = new StaffExampleBuilder();
		builder.accountEqualTo( new_staff.getAccount());
		StaffExample example = builder.build();
		long counter = staff_mapper.countByExample(example);
		if( 1 == counter) {
			staff_mapper.deleteByExample( example);
			List<Staff> list = staff_mapper.selectByExample(example);
			if( 0 == list.size()) {
				result = 1;
			} else{
				
			}
		}
		return result;
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
