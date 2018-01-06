package com.gsb.TestPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.Services.ReadDBInfos;



@Controller
public class TestNameOnlyKlass {
	
	
	
//	@ModelAttribute
//	public void addAttribute( ModelAndView mv) {
//		
//	}
//	
//	@RequestMapping(value="/TestNameOnlyPage")
//	public String sayHi( ModelAndView mv) {
//		return "TestNameOnlyPage";
//	}
	
	@RequestMapping(value="/TestNameOnlyPageWithTitle")
	public ModelAndView sayHiAgain() {
		ModelAndView mv = new ModelAndView("/WEB-INF/views/testPages/TestNameOnlyPage.jsp");
		mv.addObject("title", "TestNameOnlyPage");
		return mv;
	}
}
