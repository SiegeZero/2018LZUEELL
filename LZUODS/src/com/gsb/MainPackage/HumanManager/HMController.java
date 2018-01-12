package com.gsb.MainPackage.HumanManager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.Target;
import com.gsb.BasicObject.MBG.Person;
import com.gsb.BasicObject.MBG.PersonExample;
import com.gsb.BasicObject.MBG.PersonExample.Criteria;
import com.gsb.BasicObject.MBG.SourcePerson;
import com.gsb.BasicObject.MBGDAO.DepartmentMapper;
import com.gsb.BasicObject.Services.ReadDBInfos;


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
	public ModelAndView query( @RequestParam("id") String id, ModelAndView mv) {
		Target t = Target.getById( id);
		mv.addObject("target", t);
		return mv;
	}
	
	@RequestMapping(value="/HMHome")
	public ModelAndView home(ModelAndView mv) {
		return mv;
	}
	
	@Autowired
	ReadDBInfos db_reader;
	
	@RequestMapping(value="/HMMang")
	public ModelAndView manage( ModelAndView mv,HttpServletRequest request) {
		PersonExample example=new PersonExample();
		Criteria c = example.createCriteria();
		String name_condition = request.getParameter("name_condition");
		String func_condition = request.getParameter("func_condition");
		String title_lv_condition = request.getParameter("title_lv_condition");
		String conscription_situation_condition = request.getParameter("conscription_situation_condition");

		System.out.println("a"+func_condition);
		
		if( name_condition != null && !removeUselessHeaderStr(name_condition).equals("") ) {
			String str = " ";
			if( name_condition.contains("\t")) {
				name_condition = name_condition.replaceAll("\t", " ");
			}
			List<String> funcs = new ArrayList<>();
			for( String f:name_condition.split(str)) {
				funcs.add( f);
			}
			c.andNameIn(funcs);
			example.or(c);
			mv.addObject("name_str",name_condition);
		}
		
		if( func_condition != null&& !removeUselessHeaderStr(func_condition).equals("") ) {
			String str = " ";
			if( func_condition.contains("\t")) {
				func_condition = func_condition.replaceAll("\t", " ");
			}
			List<String> funcs = new ArrayList<>();
			for( String f:func_condition.split(str)) {
				funcs.add( f);
			}
			c.andFuncIn(funcs);
			example.or(c);
			mv.addObject("func_str",func_condition);
		}

		if( title_lv_condition != null&& !removeUselessHeaderStr(title_lv_condition).equals("") ) {
			String str = " ";
			if( title_lv_condition.contains("\t")) {
				title_lv_condition = title_lv_condition.replaceAll("\t", " ");
			}
			List<String> funcs = new ArrayList<>();
			for( String f:title_lv_condition.split(str)) {
				funcs.add( f);
			}
			c.andTitleLvIn(funcs);
			example.or(c);
			mv.addObject("title_lv_str",title_lv_condition);
		}
		
		List<SourcePerson> list =  db_reader.getBasicInfos(example);
		System.out.println( list.size());
		mv.addObject("size", list.size());
		mv.addObject("person_list", list);
		mv.addObject("nations_list", db_reader.getAllNations());
		mv.addObject("sociaties_list", db_reader.getAllSociaties());
		mv.addObject("func_list", db_reader.getAllFunc());
		mv.addObject("title_lv_list", db_reader.getAllTitleLv());
		mv.addObject("conscription_situation_list", db_reader.getAllConscriptionSituation());
		
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
	
	@RequestMapping(value="/HMAdd")
	public ModelAndView add( ModelAndView mv) {
		return mv;
	}
	
	@RequestMapping(value="/ConfirmPage")
	public ModelAndView confirm( ModelAndView mv,HttpServletRequest request) {
		return mv;
	}
	
}
