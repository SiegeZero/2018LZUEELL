package com.gsb.MainPackage.SocietyManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGDAO.SocietyMapper;
import com.gsb.BasicObject.Services.SocietyService;

@Controller
public class SocietyController {

	public SocietyController() {
		// TODO Auto-generated constructor stub
	}
	

	@Autowired
	SocietyService society_service;
	@RequestMapping(value="/SocietyMang")
	public ModelAndView society( ModelAndView mv) {
		mv.addObject("societies_list",society_service.getAllSocietiesName());
		return mv;
	}


}
