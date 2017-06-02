package com.tieto.springtraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tieto.springtraining.model.Event;

@Controller
@SessionAttributes("event")
public class EventController {

	@RequestMapping(value="event", method=RequestMethod.GET)
	public String diplayEventPage(Model model){
		
		if(!model.containsAttribute("event")){
			Event event=new Event();
			//event.setName("java groupe");
			model.addAttribute("event",event);
		}
		else{
			System.out.println(((Event) model.asMap().get("event")).getName());
		}

		return "event";
	}
	
	@RequestMapping(value="event", method=RequestMethod.POST)
	public String processEvent(@ModelAttribute("event") Event event){
		
		System.out.println(event.getName());
		
		return "redirect:index.html";
		
	}
}
