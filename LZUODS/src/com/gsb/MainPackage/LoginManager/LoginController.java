package com.gsb.MainPackage.LoginManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.Utils.Eypt;

@Controller
public class LoginController {
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public ModelAndView login( ModelAndView mv, HttpSession session,@RequestParam("last_addr")String last_addr) {
		Object o = session.getAttribute("login_staff");
		boolean login_status = false;
		if( null != o) {
			login_status = o instanceof Staff;
		}
		System.out.println("last_addr in Login:" + last_addr);
		System.out.println("login_status in Login:" + login_status);
		
		mv.addObject("last_addr", last_addr);
		mv.addObject("login_status", login_status+"");
		return mv;
	}
	
	@RequestMapping( value="/ahead", method=RequestMethod.POST)
	public String ahead( HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		System.out.println("last_addr in ahead:" + request.getParameter("last_addr"));
		System.out.println("login_status in ahead:" + request.getParameter("login_status"));
		if( request.getParameter("login_status").equals("true"))
			session.removeAttribute( "login_staff");
		Staff login_staff = new Staff();
		login_staff.setAccount( request.getParameter("account"));
		login_staff.setPassword( Eypt.md5( request.getParameter("passwd")));
		String target_addr = request.getParameter("target_addr");
		session.setAttribute("login_staff", login_staff);
		return "redirect:"+target_addr;
	}
	
	@RequestMapping( value="/leave", method=RequestMethod.GET)
	public String leave( HttpSession session) {
		session.setAttribute("login_staff", null);
		return "redirect:/LGM/Login?last_addr=/HMM/Home";
	}
	
}
