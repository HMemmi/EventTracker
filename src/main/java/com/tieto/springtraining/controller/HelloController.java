package com.tieto.springtraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String sayHello(Model model){
		System.out.println("bhb");
		model.addAttribute("greeting","hello world");
		return "hello";
	}
	
	@RequestMapping(value="/hellos", method=RequestMethod.GET)
	public String sayHellos(Model model){
		System.out.println();
		return "hello";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model){
		System.out.println("bhb");
		return "forward:index.jsp";
	}
	

	@RequestMapping(value="/eventss", method=RequestMethod.GET)
	public String say(){
		return "eventss";
	}
}
