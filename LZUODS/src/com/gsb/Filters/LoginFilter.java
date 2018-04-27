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
	
	private static AuthAccount auth;

	@Override
	public void doFilter(ServletRequest servlet_request, ServletResponse servlet_response, FilterChain filterchain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servlet_request;
        HttpServletResponse response = (HttpServletResponse) servlet_response;
        request.setCharacterEncoding("UTF-8");
        

        HttpSession session = request.getSession();
        if( null == auth) {
        	ServletContext sc = session.getServletContext();
        	XmlWebApplicationContext cxt = (XmlWebApplicationContext)WebApplicationContextUtils.getWebApplicationContext(sc);
        	auth = (AuthAccount) cxt.getBean("AuthAccount");
        }
        Object o = session.getAttribute("login_staff");
        String noFilterJsp = config.getInitParameter("noFilteredJsp");
        Staff db_staff;
        String last_addr = request.getRequestURI();
        if( last_addr.indexOf( noFilterJsp) != -1 
        		|| last_addr.contains(".css") 
        		|| last_addr.contains(".js") 
        		|| last_addr.contains(".png")
        		|| last_addr.contains(".jpg")
        		|| last_addr.contains(".gif")) {
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
        response.setCharacterEncoding("UTF-8");
		response.getWriter().print("<script>alert('"+tips+"');window.location='/LZUODS/LGM/Login?last_addr="+last_addr.substring(7)+"'</script>");
	}

	private FilterConfig config;

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		config = arg0;
	}

}
