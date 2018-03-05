package com.gsb.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeTransfer {
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	public static String Date2Str( Date source) {
		return sdf.format(source);
	}
	public static Date Str2Date( String source) throws ParseException {
		return sdf.parse(source);
	}
}
