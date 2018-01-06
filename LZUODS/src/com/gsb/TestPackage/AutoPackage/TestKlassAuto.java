package com.gsb.TestPackage.AutoPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Test")
public class TestKlassAuto {
	@RequestMapping(value="/TestAuto")
	public ModelAndView say() {
		String file_path = "/WEB-INF/views/testPages/TestKlassAutoPage.jsp";
		ModelAndView tmp = new ModelAndView( file_path);
		return tmp;
	}
}
