package com.gsb.MainPackage.HumanManager;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.Beans.SourcePerson;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.MBGPOJO.PersonExample;
import com.gsb.BasicObject.MBGPOJO.SalaryLib;
import com.gsb.BasicObject.MBGPOJO.Society;
import com.gsb.BasicObject.MBGPOJO.PersonExample.Criteria;
import com.gsb.BasicObject.Services.ReadDBInfos;
import com.gsb.BasicObject.Services.SingleAddOperate;
import com.gsb.Utils.TypeTransfer;


@Controller
public class HMController {
	
	@Autowired
	DepartmentMapper dept_mapper;
	
	@ModelAttribute
	public void setAttribute( ModelAndView mv) {
		mv.addObject("d_mapper",dept_mapper.toString());
		mv.addObject("hello", "hello");
	}
	
	@RequestMapping(value="/TestHMControllerPage")
	public ModelAndView test(ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value="/HMDtal", method=RequestMethod.GET)
	public ModelAndView query( @RequestParam("id") int id, ModelAndView mv) {
		mv.addObject("target", db_reader.getBasicInfosBy(id));
		return mv;
	}
	
	@RequestMapping(value="/Home")
	public ModelAndView home(ModelAndView mv) {
		List<Map<String, Long>> partyMembersAmount = db_reader.getPartyMembersAmount(-1);
		long lessthan100 = db_reader.getAllAmountAtRangeToday( 0, 100);
		int i=0;
		String[] party_attrs = new String[] {"党员总人数", "女性党员人数", "男性党员人数"};
		mv.addObject("party_attrs", party_attrs);
		for( Map<String,Long> tmp:partyMembersAmount) {
			mv.addObject(party_attrs[i], tmp.get(party_attrs[i++]));
		}
		i=0;
		List<Map<String, Long>> allAmount = db_reader.getAllAmount( -1);
		String[] allamount_attrs = new String[] {"总人数", "女性人数", "男性人数"};
		mv.addObject("allamount_attrs", allamount_attrs);
		for( Map<String,Long> tmp:allAmount) {
			mv.addObject(allamount_attrs[i], tmp.get(allamount_attrs[i++]));
		}
		System.out.println( "lessthan100:"+lessthan100);
		mv.addObject("lessthan100", lessthan100);
		return mv;
	}
	
	@Autowired
	ReadDBInfos db_reader;
	
	@RequestMapping(value="/HMMang")
	public ModelAndView manage( ModelAndView mv,HttpServletRequest request) {
		PersonExample example=new PersonExample();
		Criteria c = example.createCriteria();
		String name_condition = request.getParameter("name_condition");
		String age_range = request.getParameter("age_range");
		String[] nations = request.getParameterValues("nations");
		String[] societies = request.getParameterValues("society");
		String[] quit_office_types = request.getParameterValues("quit_office_type");
		String[] edu_bg = request.getParameterValues("edu_bg");
		String[] political_status = request.getParameterValues("political_status");
		
		String latest_sympathy_year = request.getParameter("latest_sympathy_year");
		if( latest_sympathy_year!= null && !latest_sympathy_year.equals("全选")) {
			if( latest_sympathy_year.equals( "本年已慰问") || latest_sympathy_year.equals( "本年未慰问")) {
				try {
					Date thisYear = TypeTransfer.Str2Date(""+Calendar.getInstance().get(Calendar.YEAR)+"0101");
					c.andLatestSympathyYearGreaterThanOrEqualTo( thisYear);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			mv.addObject( "latest_sympathy_year", latest_sympathy_year);
		}
		
		String is_help_needed = request.getParameter("is_help_needed");
		if( is_help_needed!= null && !is_help_needed.equals("全选")) {
			if( is_help_needed.equals( "是") || is_help_needed.equals( "否")) {
				c.andIsHelpNeededEqualTo( is_help_needed.equals("是")?true:false);
			}
			mv.addObject( "is_help_needed", is_help_needed);
		}
		
		String gender = request.getParameter("gender");
		if( gender!= null && !gender.equals("全部")) {
			if( gender.equals( "男") || gender.equals( "女")) {
				c.andGenderEqualTo(gender);
			}
			mv.addObject( "gender", gender);
		}
		
		String physical_situation = request.getParameter("physical_situation");
		if( physical_situation!= null && !physical_situation.equals("全部")) {
			if( physical_situation.equals( "离世")) {
				c.andPhysicalSituationLike( "%死亡%");
			} else if( physical_situation.equals( "在世")){
				c.andPhysicalSituationNotLike( "%死亡%");
			}
			mv.addObject("physical_situation",physical_situation);
		}
		String[] conscription_situation = request.getParameterValues("conscription_situation");
		if( name_condition != null && !removeUselessHeaderStr(name_condition).equals("") ) {
			String str = " ";
			if( name_condition.contains("\t")) {
				name_condition = name_condition.replaceAll("\t", " ");
			}
			List<String> funcs = new ArrayList<>();
			for( String f:name_condition.split(str)) {
				funcs.add( f);
			}
			if( funcs.size() > 1) {
				c.andNameIn(funcs);	
			} else if( funcs.size() == 1) {
				c.andNameLike("%"+funcs.get(0)+"%");
			}
			mv.addObject("name_str",name_condition);
		}

		String func_condition = request.getParameter("func_condition");
		if( func_condition != null && !removeUselessHeaderStr(func_condition).equals("") ) {
			String str = " ";
			if( func_condition.contains("\t")) {
				func_condition = func_condition.replaceAll("\t", " ");
			}
			List<String> funcs = new ArrayList<>();
			for( String f:func_condition.split(str)) {
				funcs.add( f);
			}
			if( funcs.size() > 1) {
				c.andFuncIn(funcs);	
			} else if( funcs.size() == 1) {
				c.andFuncLike("%"+funcs.get(0)+"%");
			}
			mv.addObject("func_str",func_condition);
		}
		String title_lv_condition = request.getParameter("title_lv_condition");
		if( title_lv_condition != null&& !removeUselessHeaderStr(title_lv_condition).equals("") ) {
			String str = " ";
			if( title_lv_condition.contains("\t")) {
				title_lv_condition = title_lv_condition.replaceAll("\t", " ");
			}
			List<String> funcs = new ArrayList<>();
			for( String f:title_lv_condition.split(str)) {
				funcs.add( f);
			}
			if( funcs.size() > 1) {
				c.andTitleLvIn(funcs);	
			} else if( funcs.size() == 1) {
				c.andTitleLvLike("%"+funcs.get(0)+"%");
			}
			mv.addObject("title_lv_str",title_lv_condition);
		}
		if( age_range != null && ! age_range.equals("全部")) {
			Calendar cal = Calendar.getInstance();
			String smaller_bound =  age_range.substring(0, age_range.indexOf("-"));
			String bigger_bound = age_range.substring( age_range.indexOf("-")+1);
			if( !smaller_bound.equals("")&& bigger_bound.equals("")) {
				cal.add( Calendar.YEAR, -Integer.parseInt( smaller_bound));
				c.andBirthTimeGreaterThanOrEqualTo( cal.getTime());
			} else if( !smaller_bound.equals("")&& !bigger_bound.equals("")){
				cal.add(Calendar.YEAR, -Integer.parseInt(smaller_bound));
				Date smaller = cal.getTime();
				cal.add( Calendar.YEAR, -Integer.parseInt(bigger_bound)+Integer.parseInt(smaller_bound));
				cal.add( Calendar.DATE, 1);
				Date near_bigger = cal.getTime();
				c.andBirthTimeBetween( near_bigger, smaller);
			} else if( smaller_bound.equals("")&& !bigger_bound.equals("")) {
				cal.add( Calendar.YEAR, -Integer.parseInt( bigger_bound));
				c.andBirthTimeLessThan( cal.getTime());
			}
			mv.addObject("age_range", age_range);
		}
		
		if( nations != null && nations.length != 0) {
			List<String> list = new ArrayList<>();
			for( String s:nations) {
				list.add(s);
			}
			c.andNationIn( list);
			mv.addObject("nations_str", list);
		}
		
		if( societies != null && societies.length != 0) {
			List<Integer> list = new ArrayList<>();
			for( String s:societies) {
				list.add(Integer.parseInt(s));
			}
			c.andSocietyNoIn(list);
			mv.addObject("societies_str",list);
		}
		if( quit_office_types != null && quit_office_types.length != 0) {
			List<String> list = new ArrayList<>();
			for( String s:quit_office_types) {
				list.add(s);
			}
			c.andQuitOfficeTypeIn(list);
			mv.addObject("quit_office_type_str",list);
		}
		if( edu_bg != null && edu_bg.length != 0) {
			List<String> list = new ArrayList<>();
			for( String s:edu_bg) {
				if( !s.equals("无数据")) {
					list.add(s);
				} else {
					list.add("");
				}
			}
			c.andEduBgIn(list);
			mv.addObject("edu_bg_str",list);
		}
		if( conscription_situation != null && conscription_situation.length != 0) {
			List<String> list = new ArrayList<>();
			for( String s:conscription_situation) {
				list.add(s);
			}
			c.andConscriptionSituationIn(list);
			mv.addObject("cs_str", list);
		}
		
		if( political_status != null && political_status.length != 0) {
			List<String> list = new ArrayList<>();
			for( String s:political_status) {
				list.add(s);
			}
			c.andPoliticalStatusIn(list);
			mv.addObject("political_status_str",list);
		}
		example.or(c);
		
		List<SourcePerson> person_list =  db_reader.getBasicInfos(example, -1);
		List<String> nations_list = db_reader.getAllNations();
		System.out.println( "show nation size:"+nations_list.size());
		List<Society> societies_list = db_reader.getAllSocieties();
		System.out.println( "show societies size:"+societies_list.size());
		List<String> func_list = db_reader.getAllFunc();
		List<String> title_lv_list = db_reader.getAllTitleLv();
		List<String> cs_list = db_reader.getAllConscriptionSituation();
		List<String> political_status_list = db_reader.getAllPoliticalStatus();
		List<String> edu_bg_list = db_reader.getAllEduBg();
		mv.addObject("person_amount", person_list.size());
		mv.addObject("person_list", person_list);
		mv.addObject("nations_amount", nations_list.size());
		mv.addObject("nations_list", nations_list);
		mv.addObject("societies_amount", societies_list.size());
		mv.addObject("societies_list", societies_list);
		mv.addObject("func_amount", func_list.size());
		mv.addObject("func_list", func_list);
		mv.addObject("title_lv_amount", title_lv_list.size());
		mv.addObject("title_lv_list", title_lv_list);
		mv.addObject("conscription_situation_amount", cs_list.size());
		mv.addObject("conscription_situation_list", cs_list);
		mv.addObject("political_status_list",political_status_list);
		mv.addObject("edu_bg_list",edu_bg_list);
		
		return mv;
	}

	private String removeUselessHeaderStr(String name_condition) {
		while(name_condition.startsWith(" ") || name_condition.startsWith("\t") || name_condition.startsWith("\n")) {
			name_condition = name_condition.substring(1,name_condition.length()-1);
		}
		return name_condition;
	}
	
	@RequestMapping(value="/PTMang")
	public ModelAndView party( ModelAndView mv) {
		return mv;
	}

	@RequestMapping(value="/EVMang")
	public ModelAndView event( ModelAndView mv) {
		return mv;
	}
	
	@Autowired
	SingleAddOperate sao;
	
	String base_url = "redirect:/HMM/";
	@RequestMapping(value="/save_basic_info")
	public String save_basic_info( HttpServletRequest request) {
		int id = -1;
		SourcePerson new_person = new SourcePerson();
		new_person.setName( request.getParameter("name"));
		new_person.setGender( request.getParameter("gender"));
		new_person.setNativePlace( request.getParameter("native_place"));
		new_person.setNation( request.getParameter( "nation"));
		new_person.setBirth( request.getParameter("birth_date"));
		new_person.setSalaryNo( request.getParameter( "salary_no"));
		new_person.setDept( request.getParameter( "dept"));
		new_person.setSlib( request.getParameter("slary_lib"));
		new_person.setFunc( request.getParameter( "func"));
		new_person.setSociety( request.getParameter("society"));
		new_person.setTitleLv( request.getParameter( "title_lv"));
		new_person.setEduBg( request.getParameter( "edu_bg"));
		new_person.setStart_job( request.getParameter("start_time"));
		new_person.setTelephoneNum( request.getParameter("telephone_num"));
		new_person.setEnd_job( request.getParameter("end_time"));
		new_person.setPhysicalSituation( request.getParameter("physical_situation"));
		new_person.setPoliticalStatus( request.getParameter("political_status"));
		new_person.setQuitOfficeType( request.getParameter("quit_office_type"));
		new_person.setConscriptio_situation( request.getParameter( "conscription_situation"));
		new_person.setNeed_help(request.getParameter("is_help_needed"));
		new_person.setLivingSituation( request.getParameter("living_situation"));
		new_person.setAddress( request.getParameter("address"));
		id = sao.addAPerson( new_person);
		String redirect_url = base_url + "Error";
		if( id != -1) {
			redirect_url = base_url + "HMDtal?id=" + id;
		}
		return redirect_url;
	}
	
	@RequestMapping(value="/HMEdit")
	public ModelAndView edit( ModelAndView mv) {
		List<String> nations_list = db_reader.getAllNations();
		List<Society> societies_list = db_reader.getAllSocieties();
		List<String> func_list = db_reader.getAllFunc();
		List<String> title_lv_list = db_reader.getAllTitleLv();
		List<String> cs_list = db_reader.getAllConscriptionSituation();
		List<SalaryLib> slib_list = db_reader.getAllSLibs();

		mv.addObject("slib_list_amount", slib_list.size());
		mv.addObject("slib_list", slib_list);
		mv.addObject("nations_amount", nations_list.size());
		mv.addObject("nations_list", nations_list);
		mv.addObject("societies_amount", societies_list.size());
		mv.addObject("societies_list", societies_list);
		mv.addObject("func_amount", func_list.size());
		mv.addObject("func_list", func_list);
		mv.addObject("title_lv_amount", title_lv_list.size());
		mv.addObject("title_lv_list", title_lv_list);
		mv.addObject("conscription_situation_amount", cs_list.size());
		mv.addObject("conscription_situation_list", cs_list);
		return mv;
	}
	
	@RequestMapping(value="/ConfirmPage")
	public ModelAndView confirm( ModelAndView mv,HttpServletRequest request) {

		List<Society> societies_list = db_reader.getAllSocieties();
		mv.addObject("societies_amount", societies_list.size());
		mv.addObject("societies_list", societies_list);
		return mv;
	}
	
	@RequestMapping(value="/UpdateConfirmPage", method=RequestMethod.POST)
	public ModelAndView updateConfirm(  @RequestParam("id") int id,ModelAndView mv,HttpServletRequest request) {

		SourcePerson new_person = new SourcePerson();
		new_person.setName( request.getParameter("name"));
		new_person.setGender( request.getParameter("gender"));
		new_person.setNativePlace( request.getParameter("native_place"));
		new_person.setNation( request.getParameter( "nation"));
		new_person.setBirth( request.getParameter("birth_date"));
		new_person.setSalaryNo( request.getParameter( "salary_no"));
		new_person.setDept( request.getParameter( "dept"));
		new_person.setSlib( request.getParameter("salary_lib"));
		new_person.setFunc( request.getParameter( "func"));
		new_person.setSociety( request.getParameter("society"));
		new_person.setTitleLv( request.getParameter( "title_lv"));
		new_person.setEduBg( request.getParameter( "edu_bg"));
		new_person.setStart_job( request.getParameter("start_time"));
		new_person.setEnd_job( request.getParameter("end_time"));
		new_person.setPoliticalStatus( request.getParameter("political_status"));
		new_person.setQuitOfficeType( request.getParameter("quit_office_type"));
		new_person.setConscriptio_situation( request.getParameter( "conscription_situation"));
		new_person.setNeed_help(request.getParameter("is_help_needed"));
		new_person.setLivingSituation( request.getParameter("living_situation"));
		new_person.setAddress( request.getParameter("address"));
		new_person.setTelephoneNum( request.getParameter("telephone_num"));
		new_person.setPhysicalSituation( request.getParameter("physical_situation"));
		new_person.setLastest_sympathy_year( request.getParameter("lastest_sympathy_year"));
		new_person.setPensionModelNo( Integer.parseInt(request.getParameter("pension_model_no")));
		mv.addObject("target", db_reader.getBasicInfosBy(id));
		mv.addObject("new_person", new_person);
		return mv;
	}
	
	@RequestMapping(value="/update_basic_info")
	public String update_basic_info( HttpServletRequest request) {
		SourcePerson new_person = new SourcePerson();
		new_person.setSysNo( Integer.parseInt(request.getParameter("sys_no")));
		new_person.setName( request.getParameter("name"));
		new_person.setGender( request.getParameter("gender"));
		new_person.setNativePlace( request.getParameter("native_place"));
		new_person.setNation( request.getParameter( "nation"));
		new_person.setBirth( request.getParameter("birth_date"));
		new_person.setSalaryNo( request.getParameter( "salary_no"));
		new_person.setDept( request.getParameter( "dept"));
		new_person.setSlib( request.getParameter("salary_lib"));
		new_person.setFunc( request.getParameter( "func"));
		new_person.setSociety( request.getParameter("society"));
		new_person.setTitleLv( request.getParameter( "title_lv"));
		new_person.setEduBg( request.getParameter( "edu_bg"));
		new_person.setStart_job( request.getParameter("start_time"));
		new_person.setEnd_job( request.getParameter("end_time"));
		new_person.setPoliticalStatus( request.getParameter("political_status"));
		new_person.setQuitOfficeType( request.getParameter("quit_office_type"));
		new_person.setConscriptio_situation( request.getParameter( "conscription_situation"));
		new_person.setNeed_help(request.getParameter("is_help_needed"));
		new_person.setLivingSituation( request.getParameter("living_situation"));
		new_person.setAddress( request.getParameter("address"));
		new_person.setTelephoneNum( request.getParameter("telephone_num"));
		new_person.setPhysicalSituation( request.getParameter("physical_situation"));
		new_person.setLastest_sympathy_year( request.getParameter("lastest_sympathy_year"));
		new_person.setPensionModelNo( Integer.parseInt(request.getParameter("pension_model_no")));
		sao.updatePersonInfo( new_person);
		return "redirect:/HMM/HMDtal?id="+new_person.getSysNo();
	}
	
	@RequestMapping(value="/HMAnls")
	public ModelAndView analysis(ModelAndView mv) {
		List<Map<String, Long>> partyMembersAmount = db_reader.getPartyMembersAmount(-1);
		long lessthan100 = db_reader.getAllAmountAtRangeToday( 0, 100);
		int i=0;
		String[] party_attrs = new String[] {"党员总人数", "女性党员人数", "男性党员人数"};
		mv.addObject("party_attrs", party_attrs);
		for( Map<String,Long> tmp:partyMembersAmount) {
			mv.addObject(party_attrs[i], tmp.get(party_attrs[i++]));
		}
		i=0;
		List<Map<String, Long>> allAmount = db_reader.getAllAmount( -1);
		String[] allamount_attrs = new String[] {"总人数", "女性人数", "男性人数"};
		mv.addObject("allamount_attrs", allamount_attrs);
		for( Map<String,Long> tmp:allAmount) {
			mv.addObject(allamount_attrs[i], tmp.get(allamount_attrs[i++]));
		}
		System.out.println( lessthan100);
		mv.addObject("lessthan100", lessthan100);
		return mv;
	}
	
}
