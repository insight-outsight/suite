package com.selffun.suite.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Show {
	@Autowired
	private PHBean pHBean;
	
	@RequestMapping("/adore")
	public String yi(Model model){
		model.addAttribute("ni", "hao2");
		model.addAttribute("sb",pHBean.getShiba());
		return "wai";
	}
	
}
