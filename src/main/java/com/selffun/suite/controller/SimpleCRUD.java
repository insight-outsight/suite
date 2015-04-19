package com.selffun.suite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleCRUD {

	@RequestMapping(value="/listAll.do",method=RequestMethod.GET,produces="application/json; charset=utf-8") 
	@ResponseBody //用于直接在页面显示result中的字符
	public String listAll() {
	    return "{RESULT:\"SUCCESS\"}";
	}
	  
}
