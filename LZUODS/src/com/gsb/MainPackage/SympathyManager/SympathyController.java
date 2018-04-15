package com.gsb.MainPackage.SympathyManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGPOJO.SympathyAtv;
import com.gsb.BasicObject.Services.EventService;

@Controller
public class SympathyController {

	@Autowired
	EventService event_service;
	
	@RequestMapping(value = "/SympathyAtv")
	public ModelAndView symAtv( ModelAndView mv) {
		List<SympathyAtv> atv_list = event_service.getAllSympathyAtv();
		mv.addObject("sympathy_atv_list", atv_list);
		mv.addObject("sympathy_list", event_service.showAllAboutSympathyAtv( atv_list));
		return mv;
	}
	
}
