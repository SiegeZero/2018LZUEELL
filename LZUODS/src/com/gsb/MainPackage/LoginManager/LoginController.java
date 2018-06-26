package com.gsb.MainPackage.LoginManager;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.BasicObject.Services.SignUpService;
import com.gsb.Utils.Eypt;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public ModelAndView login( ModelAndView mv, HttpSession session, HttpServletRequest request) {
		String last_addr = request.getParameter("last_addr");
		if(last_addr == null || last_addr.equals("") || last_addr.startsWith("/LGM") || last_addr.equals("/")){
			last_addr = "/HMM/HMMang";
		}
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
		Staff staff = (Staff) session.getAttribute("login_staff");
		if( staff != null) {
			staff.setPassword("");
			staff.setAccount("");
			staff.setSysLevel("z");
		}
		session.setAttribute("login_staff", staff);
		session.setAttribute("login_staff", null);
		return "redirect:/LGM/Login?last_addr=/HMM/Home";
	}
	
	
	@RequestMapping( value="/SignUp")
	public String signupView() {
		return "SignUp";
	}
	
	@Autowired
	SignUpService sign_up_handler;
	
	@RequestMapping( value="signup2DB", method=RequestMethod.POST)
	public ModelAndView signup2DB( ModelAndView mv, HttpServletRequest request) {
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String telephone_num = request.getParameter("telephone_num");
		String password = request.getParameter("password");
		String account = request.getParameter("account");
		Staff new_staff = new Staff();
		new_staff.setAccount(account);
		new_staff.setGender(gender);
		new_staff.setName(name);
		new_staff.setPassword(password);
		new_staff.setTelephoneNum(telephone_num);
		new_staff.setSysLevel("z");
		int sys_no = sign_up_handler.insertNewStaff( new_staff);
		return mv;
	}
	
}
