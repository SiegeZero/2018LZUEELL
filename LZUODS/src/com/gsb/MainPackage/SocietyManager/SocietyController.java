package com.gsb.MainPackage.SocietyManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.Services.ReadDBInfos;
import com.gsb.BasicObject.Services.SocietyService;

@Controller
public class SocietyController {

	public SocietyController() {
		// TODO Auto-generated constructor stub
	}
	

	@Autowired
	SocietyService society_service;
	
	@Autowired
	ReadDBInfos db_reader;
	
	@RequestMapping(value="/SocietyMang")
	public ModelAndView society( ModelAndView mv) {
		mv.addObject("societies_list",society_service.getAllSocieties());
		mv.addObject("amount_each_society", db_reader.getAmountEachSociety(1));
		return mv;
	}


}
