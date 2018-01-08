package com.gsb.TestPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBG.AtvInfo;
import com.gsb.BasicObject.Services.StoreNewInfos;

@Controller
public class TestJBean {

	
	@RequestMapping(value="/setBean")
	public String setBean( Model m) {
		
		m.addAttribute("atv_info", new AtvInfo());
		return "setBean";
	}
	
	@Autowired
	StoreNewInfos sni;
	
	@RequestMapping(value="/save-bean")
	public String saveBean( Model m, @ModelAttribute AtvInfo atv_info) {
		m.addAttribute("atv_info", atv_info);
		sni.storeAtvInfo(atv_info);
		return "forward:/index.jsp";
	}
}
