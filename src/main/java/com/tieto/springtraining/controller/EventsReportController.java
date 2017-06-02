package com.tieto.springtraining.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tieto.springtraining.model.Event;

@RestController
public class EventsReportController {

	
	@RequestMapping(value="events", method=RequestMethod.GET)
	public List<Event> getEvents() {
		List<Event> events=new ArrayList<>();
		Event event1=new Event();
		event1.setName("java groups");
		
		Event event2=new Event();
		event2.setName("java ji");
		
		events.add(event1);
		events.add(event2);
		System.out.println("hello");
		
		return events;
	}
	
	@RequestMapping(value="events", method=RequestMethod.POST)
	public List<Event> getEvent() {
		List<Event> events=new ArrayList<>();
		Event event1=new Event();
		event1.setName("java groups");
		
		Event event2=new Event();
		event2.setName("java ji");
		
		events.add(event1);
		events.add(event2);
		System.out.println("helloo");
		
		return events;
	}
	
	
	@RequestMapping(value="/putdata",method = RequestMethod.PUT)
	public void putData(@RequestBody List<Animal> address) {
		
		System.out.println(address);
	}	
}
