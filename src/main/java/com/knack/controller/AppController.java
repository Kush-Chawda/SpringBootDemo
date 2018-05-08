package com.knack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.knack.model.Properties;

@Controller
public class AppController {
	
	@Autowired
	Properties prop;
	
	@RequestMapping("/")
	public String welcome(Model model) {
		prop.setMessage("Hello Spring");
		model.addAttribute("message",prop.getMessage());
		
		return "welcome";
	}

}
