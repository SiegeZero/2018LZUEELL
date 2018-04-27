package com.gsb.Utils;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Decorator {
	public static HttpServletResponse asUTF8( HttpServletResponse source) {
		source.setCharacterEncoding("UTF-8");
        source.setContentType("text/html; charset=UTF-8");
		return source;
	}
	public static HttpServletRequest asUTF8( HttpServletRequest source) {
		try {
			source.setCharacterEncoding( "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return source;
	}
}
