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
	private Department dept;
	private Sociaty sociaty;
	private SalaryLib slib;
	private String gender;
	private String birth;
	private String start_job;
	private String end_job;
	private String conscriptio_situation;
	private String need_help;
	private String lastest_sympathy_year;
	

	private SimpleDateFormat sdf;
	
	
	
	
	public SourcePerson() {
		super();
		dept = new Department();
		sociaty = new Sociaty();
		slib = new SalaryLib();
		sdf = new SimpleDateFormat("yyyyMMdd");
	}

	public PersonWithBLOBs format(Map<String, Integer> depts_map, Map<String, Integer> sociaties_map, Map<String, Integer> slib_map){
		
		int deptNo = depts_map.get( this.dept.getDeptName());
		this.setDeptNo( deptNo);
		this.dept.setDeptNo(deptNo);
		int sociatyNo = sociaties_map.get( this.sociaty.getSociatyName());
		this.setSociatyNo( sociatyNo);
		this.sociaty.setSociatyNo( sociatyNo);
		if( this.slib.getSalaryVersion() != null) {
			int slibNo = slib_map.get( this.slib.getSalaryVersion());
			this.setSalaryLibNo( slibNo);
			this.slib.setSalaryLibNo( slibNo);
		}
		if( conscriptio_situation != null)
			this.setConscriptionSituation( conscriptio_situation.equals("非军属")?"":conscriptio_situation);
		this.setIsHelpNeeded( need_help.equals( "是")?true:false);
		if( birth.endsWith("0000")) {
			birth = birth.substring(0,4).concat("0101");
		} else if( birth.endsWith("00")) {
			birth = birth.substring(0,6).concat("01");
		}
		if( start_job.endsWith("0000")) {
			start_job = start_job.substring(0,4).concat("0101");
		} else if( birth.endsWith("00")) {
			start_job = start_job.substring(0,6).concat("01");
		}
		if( end_job.endsWith("0000")) {
			end_job = end_job.substring(0,4).concat("0101");
		} else if( end_job.endsWith("00")) {
			end_job = end_job.substring(0,6).concat("01");
		}
		
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
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void setDept(String dept_name) {
		this.dept.setDeptName(dept_name);;
	}

	public Sociaty getSociaty() {
		return sociaty;
	}

	public void setSociaty(Sociaty sociaty) {
		this.sociaty = sociaty;
	}
	
	public void setSociaty(String sociaty_name) {
		this.sociaty.setSociatyName(sociaty_name);;
	}

	public SalaryLib getSlib() {
		return slib;
	}

	public void setSlib(SalaryLib slib) {
		this.slib = slib;
	}
	
	public void setSlib(String slib_name) {
		this.slib.setSalaryVersion(slib_name);;
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

	public String getLastest_sympathy_year() {
		return lastest_sympathy_year;
	}

	public void setLastest_sympathy_year(String lastest_sympathy_year) {
		this.lastest_sympathy_year = lastest_sympathy_year;
	}
	
	
	
	
}
