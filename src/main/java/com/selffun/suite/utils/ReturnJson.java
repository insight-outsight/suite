package com.selffun.suite.utils;

public class ReturnJson {
	
	public static String reJson(int i){
		String reJson="";
		reJson="{"+"\"status\""+":"+1+","+"\"id\""+":"+i+"}";
		return reJson;
	}
	public static String integerToJson(int i){
		String rejs="";
		rejs="{"+"\"status\""+":"+1+"}";
		return rejs;
	}
}
