package com.ceshi.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaTest {

	public static void main(String[] args) {
		/*String date = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		String string = "";
		for (int i = date.length()-1; i >= 0; i--) {
			string += date.charAt(i);
		}
		System.out.println(string);*/
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
//		Random r = new Random(); 
//		Double d = r.nextDouble();
//		int[] i = {9,10,11,12,13};
//		String s = d + ""; 
//		s=s.substring(3,i[r.nextInt(4)]); 
//		System.out.println(s); 
		
		
		Date randomDate = randomDate("2016-01-01", "2017-10-07");  
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(randomDate("2016-01-01", "2017-10-07"))); 
		
	}
	
	
	
	 private static Date randomDate(String beginDate, String endDate) {  
	        try {  
	            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	            Date start = format.parse(beginDate);// 构造开始日期  
	            Date end = format.parse(endDate);// 构造结束日期  
	            // getTime()表示返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。  
	            if (start.getTime() >= end.getTime()) {  
	                return null;  
	            }  
	            long date = random(start.getTime(), end.getTime());  
	  
	            return new Date(date);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return null;  
	    }  
	  
	    private static long random(long begin, long end) {  
	        long rtn = begin + (long) (Math.random() * (end - begin));  
	        // 如果返回的是开始时间和结束时间，则递归调用本函数查找随机值  
	        if (rtn == begin || rtn == end) {  
	            return random(begin, end);  
	        }  
	        return rtn;  
	    } 

}
