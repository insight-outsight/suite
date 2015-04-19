package com.selffun.suite.utils;

public class RelFold {
	
	public static StringBuilder relToFold(StringBuilder json,int type){
		StringBuilder reStr = new StringBuilder();
		String[] tempArray;
		tempArray=json.toString().substring(1, json.toString().length()-1).split(",");
		String teStr="";
		//用于叶子节点不在JOSN中出现state字段
		teStr="{"+"\"attr\""+":"+"{"+tempArray[1]+","+tempArray[4]+"}"+","+tempArray[3]+(type==0?"":","+tempArray[2])+"}";
		reStr.append(teStr.toString());
		return reStr;
	}
}
