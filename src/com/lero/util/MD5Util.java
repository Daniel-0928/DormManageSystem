package com.lero.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Base64;

public class MD5Util {
	
	public static String EncoderPwdByMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		Base64.Encoder base64en =  Base64.getEncoder();
		return base64en.encodeToString(md5.digest(str.getBytes("utf-8")));
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		System.out.println(MD5Util.EncoderPwdByMD5("123456"));
	}
}
