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

public class IpFilter2 implements Filter{

	boolean debugging = true;
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servlet_request, ServletResponse servlet_response, FilterChain filterchain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servlet_request;
        HttpServletResponse response = (HttpServletResponse) servlet_response;
        String addr = request.getRemoteAddr();
        System.out.println( "addr:" + addr);
        String noFilterJsp = config.getInitParameter("noFilteredJsp");
        if (true) {
            filterchain.doFilter(servlet_request, servlet_response);
            return;
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
		config = arg0;
	}

}
