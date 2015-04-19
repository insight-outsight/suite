package com.selffun.suite.utils;

public class TypeToInt {
	
	public static Integer StringToInt(String str){
		int reInt = 0;
		if(str.equals("default")){
			reInt=0;
		}else if(str.equals("folder")){
			reInt=1;
		}
		return reInt;
	}
}
