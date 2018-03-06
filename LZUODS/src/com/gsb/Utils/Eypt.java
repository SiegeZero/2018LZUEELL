package com.gsb.Utils;

import org.apache.shiro.crypto.hash.Md5Hash;  

public class Eypt {
	public static String md5( String source) {
		return new Md5Hash(source, "GSB'sBadGuy").toString();
	}
}
