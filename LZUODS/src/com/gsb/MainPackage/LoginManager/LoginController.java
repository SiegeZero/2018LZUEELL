package com.gsb.MainPackage.LoginManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.Utils.Eypt;

@Controller
public class LoginController {
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public String login( ModelAndView mv, HttpSession session) {
		Object o = session.getAttribute("login_staff");
		boolean login_status = false;
		if( null != o) {
			login_status = o instanceof Staff;
		}
		mv.addObject("login_status", login_status);
		return "Login";
	}
	
	@RequestMapping( value="/ahead", method=RequestMethod.POST)
	public String ahead( HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		if( request.getParameter("login_status").equals("true"))
			session.removeAttribute( "login_staff");
		Staff login_staff = new Staff();
		login_staff.setAccount( request.getParameter("account"));
		login_staff.setPassword( Eypt.md5( request.getParameter("passwd")));
		session.setAttribute("login_staff", login_staff);
		return "redirect:/HMM/HMHome";
	}
	
	public String leave( HttpSession session) {
		session.removeAttribute("login_staff");
		return "redirect:/LGM/Login";
	}
	
}
