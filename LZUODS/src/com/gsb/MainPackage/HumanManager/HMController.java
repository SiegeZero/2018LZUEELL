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
		String func_condition = request.getParameter("func_condition");
		if( func_condition != null) {
			Criteria c = example.createCriteria();
			String str = " ";
			if( func_condition.contains("\t")) {
				str = "\t";
			}
			List<String> funcs = new ArrayList<>();
			for( String f:func_condition.split(str)) {
				funcs.add( f);
			}
			c.andFuncIn(funcs);
			example.or(c);
		}
		
		List<SourcePerson> list =  db_reader.getBasicInfos(example);
		System.out.println( list.size());
		mv.addObject("size", list.size());
		mv.addObject("person_list", list);
		mv.addObject("nations_list", db_reader.getAllNations());
		mv.addObject("sociaties_list", db_reader.getAllSociaties());

		mv.addObject("func_list", db_reader.getAllFunc());
		
		return mv;
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
