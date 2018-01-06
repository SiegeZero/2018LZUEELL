package com.gsb.BasicObject.MBG;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.gsb.BasicObject.MBG.DepartmentExample.Criteria;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGDAO.SalaryLibMapper;
import com.gsb.BasicObject.MBGDAO.SociatyMapper;

public class SourcePerson extends PersonWithBLOBs {
	private String dept;
	private String sociaty;
	private String slib;
	private String gender;
	private String birth;
	private String start_job;
	private String end_job;
	private String conscriptio_situation;
	private String need_help;
	

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public PersonWithBLOBs format(Map<String, Integer> depts_map, Map<String, Integer> sociaties_map, Map<String, Integer> slib_map){
		
		this.setDeptNo( depts_map.get( dept));
		this.setSociatyNo(sociaties_map.get( sociaty));
		this.setSalaryLibNo(slib_map.get( slib));
		this.setConscriptionSituation( conscriptio_situation.equals("非军属")?null:conscriptio_situation);
		this.setIsHelpNeeded( need_help.equals( "是")?true:false);
		try {
			this.setBirthTime(birth.equals("")?null:sdf.parse(birth));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			this.setJobStartTime( start_job.equals("")?null:sdf.parse(start_job));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			this.setJobEndTime( end_job.equals("")?null:sdf.parse(end_job));
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return this;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSociaty() {
		return sociaty;
	}
	public void setSociaty(String sociaty) {
		this.sociaty = sociaty;
	}
	public String getSlib() {
		return slib;
	}
	public void setSlib(String slib) {
		this.slib = slib;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getStart_job() {
		return start_job;
	}
	public void setStart_job(String start_job) {
		this.start_job = start_job;
	}
	public String getEnd_job() {
		return end_job;
	}
	public void setEnd_job(String end_job) {
		this.end_job = end_job;
	}

	public String getConscriptio_situation() {
		return conscriptio_situation;
	}

	public void setConscriptio_situation(String conscriptio_situation) {
		this.conscriptio_situation = conscriptio_situation;
	}

	public String getNeed_help() {
		return need_help;
	}

	public void setNeed_help(String need_help) {
		this.need_help = need_help;
	}
	
	
}
