package com.tieto.springtraining.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tieto.springtraining.model.Attendee;

@Controller
public class AttendeeController {

	@RequestMapping(value = "attendee", method = RequestMethod.GET)
	public ModelAndView displayAttendeePage(Model model) {
		Attendee attendee = new Attendee();
		model.addAttribute("attendee", attendee);
		ModelAndView models=new ModelAndView("attendee");
		return models;
	}
	
	

	@RequestMapping(value = "attendee", method = RequestMethod.POST)
	public String processAttendeePage(@Valid Attendee attendee,BindingResult res,Model m) {
		
		System.out.println(attendee.getName());
		if(res.hasErrors())
			return "attendee";
		
		return "redirect:index.html";
		
	}
	
	
}
