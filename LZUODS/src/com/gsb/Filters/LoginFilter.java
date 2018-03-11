package com.gsb.Filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.gsb.BasicObject.MBGPOJO.Staff;
import com.gsb.BasicObject.Services.AuthAccount;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		
	}
	
	AuthAccount auth;

	@Override
	public void doFilter(ServletRequest servlet_request, ServletResponse servlet_response, FilterChain filterchain)
			throws IOException, ServletException {
		
		System.out.println(auth);
		HttpServletRequest request = (HttpServletRequest) servlet_request;
        HttpServletResponse response = (HttpServletResponse) servlet_response;
        request.setCharacterEncoding("UTF-8");
        

        HttpSession session = request.getSession();
        ServletContext sc = session.getServletContext();
        XmlWebApplicationContext cxt = (XmlWebApplicationContext)WebApplicationContextUtils.getWebApplicationContext(sc);
        if(cxt != null && cxt.getBean("AuthAccount") != null && auth == null)
        	auth = (AuthAccount) cxt.getBean("AuthAccount");
        
        Object o = session.getAttribute("login_staff");
        String noFilterJsp = config.getInitParameter("noFilteredJsp");
        Staff db_staff;
        if( request.getRequestURI().indexOf( noFilterJsp) != -1) {
            filterchain.doFilter(servlet_request, servlet_response);
            return;
        }
        String tips = "未登录，跳转到登录页面！";
        if( o != null && o instanceof Staff) {
        	db_staff = auth.access( (Staff)o);
        	if(db_staff != null) {
        		session.setAttribute("login_staff", db_staff);
        		filterchain.doFilter(servlet_request, servlet_response);
        		return;
        	}else {
        		tips = "用户名或密码错误，请重新登录！";
        	}
        }
        response.setContentType("text/html; charset=UTF-8");
		response.getWriter().print("<script>alert('"+tips+"');window.location='/LZUODS/LGM/Login'</script>");
        //response.sendRedirect("/LZUODS/LGM/Login");
	}

	private FilterConfig config;

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		config = arg0;		
	}

}
