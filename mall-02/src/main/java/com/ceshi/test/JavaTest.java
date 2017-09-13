package com.ceshi.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaTest {

	public static void main(String[] args) {
		String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String string = "";
		for (int i = date.length()-1; i >= 0; i--) {
			string += date.charAt(i);
		}
		System.out.println(string);
//		String string = "我是一个好人";
//		String[] string2 = new String[string.length()];
//		for (int i = 0; i < string.length(); i++) {
//			string2[i] = string.substring(i, i+1);
//		}
//
//		for (int i = 0; i < string2.length; i++) {
//			System.out.println(string2[i]);
//		}
//		
	}

}
