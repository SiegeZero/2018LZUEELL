package com.gsb.TestPackage.AutoPackage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gsb.BasicObject.Beans.SourcePerson;
import com.gsb.BasicObject.MBGPOJO.Person;
import com.gsb.BasicObject.Services.ReadDBInfos;

@Controller
public class TestKlassWithTitle {
	
	@Autowired
	ReadDBInfos db_reader;
	
	@RequestMapping( value="/TestNameOnlyPage")
	public Model showInfos( Model m) {
		List<SourcePerson> list =  db_reader.getBasicInfos(null, -1);
		System.out.println( list.size());
		m.addAttribute("size", list.size());
		m.addAttribute("person_list", list);
		return m;
	}
	

	@RequestMapping(value="/TestKlassWithTitle")
	public Model sayHi( Model m) {
		m.addAttribute("title", "TestKlassWithTitle");
		return m;
	}
}
