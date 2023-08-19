package com.uniguide.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.College;
import com.uniguide.beans.Event;
import com.uniguide.beans.UserLogin;
import com.uniguide.service.EventService;
@RequestMapping("/event")
@RestController
@CrossOrigin
public class EventController {
	
	@Autowired
	private EventService eventservice;
	
	
	// this controller only return the list of event to display but if past data is present in db then it will also get fetched
	// so we need to use event procedure
	@GetMapping("/")
	public List<Event> getAllOngoingEvent()
	{
		List<Event> elist= eventservice.getEvents();
		return elist;
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addEvent(@RequestBody Event e){
		boolean status=eventservice.addEvent(e);
		if(status)
			return ResponseEntity.ok("Event added successfully");
		return ResponseEntity.ok("Event not added");
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateEvent(@RequestBody Event e){
		boolean status=eventservice.update(e);
		if(status)
			return ResponseEntity.ok("Event updated successfully");
		
		return ResponseEntity.ok("Event not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEvent(@PathVariable int id){
		boolean status=eventservice.delete(id);
		if(status)
			return ResponseEntity.ok("Event deleted succesfully");
		return ResponseEntity.ok("Event deleted unsuccesfully");
		
	}
	
	

}
