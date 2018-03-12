package com.gsb.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTransfer {

	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public static String Date2Str( Date source, String pattern) {
		if( null == source) {
			return null;
		}
		if( !sdf.toPattern().equals(pattern)) {
			sdf.applyPattern(pattern);
		}
		return sdf.format(source);
	}
	public static Date Str2Date( String source, String pattern) throws ParseException {
		if( null == source) {
			return null;
		}
		if( !sdf.toPattern().equals(pattern)) {
			sdf.applyPattern(pattern);
		}
		return sdf.parse(source);
	}
	public static String Date2Str( Date source) {
		if( null == source) {
			return null;
		}
		if( !sdf.toPattern().equals( "yyyyMMdd")) {
			sdf.applyPattern( "yyyyMMdd");
		}
		return sdf.format(source);
	}
	public static Date Str2Date( String source) throws ParseException {
		if( null == source) {
			return null;
		}
		if( !sdf.toPattern().equals( "yyyyMMdd")) {
			sdf.applyPattern( "yyyyMMdd");
		}
		return sdf.parse(source);
	}
	
}
