package com.gsb.Filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpFilter implements Filter{

	boolean debugging = true;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletrequest;
        HttpServletResponse response = (HttpServletResponse) servletresponse;
        String addr = request.getRemoteAddr();
        System.out.println( "addr:" + addr);
        String noFilterJsp = config.getInitParameter("noFilteredJsp");
        if (request.getRequestURI().indexOf( noFilterJsp) != -1 || isSecurityIp(addr)) {
            filterchain.doFilter(servletrequest, servletresponse);
        } else {
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().print("<script>alert('客户端未授权，请联系管理员！');</script>");
        }
	}

	private boolean isSecurityIp(String addr) {
		boolean isAccess = false;
		String FilteredIP = config.getInitParameter("FilteredIP");
		if( addr.substring( 0, FilteredIP.length() - 1).equals( FilteredIP) ) {
			isAccess = true;
		}
		if( debugging) {
			isAccess = true;
		}
		return true;
	}
	private FilterConfig config;
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		config = arg0;
	}

}
