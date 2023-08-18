package com.uniguide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.Event;
import com.uniguide.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eventservice;
	
	
	// this controller only return the list of event to display but if past data is present in db then it will also get fetched
	// so we need to use event procedure
	@GetMapping("/event")
	public List<Event> getAllOngoingEvent()
	{
		List<Event> elist= eventservice.getEvents();
		return elist;
	}
	
	

}
