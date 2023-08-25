package com.uniguide.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.uniguide.beans.AppFeedback;
import com.uniguide.beans.Event;
import com.uniguide.beans.University;
import com.uniguide.beans.UserLogin;
import com.uniguide.service.AppFeedbackService;

@RequestMapping("/appfeedback")
@RestController
@CrossOrigin
public class AppFeedbackController {
	@Autowired
	private AppFeedbackService appfeedback;
	
	
	@PostMapping("/")
	public ResponseEntity<?> giveFeedback( @RequestBody AppFeedback fb) {
		System.out.println("inside the controller");
		System.out.println("feedback"+fb);
		appfeedback.giveFeedback(fb);
		  return ResponseEntity.ok("feedback added successfully");
	}
	
	@GetMapping("/")
	public List<AppFeedback> getFeedbackData() {
		System.out.println(appfeedback.getfeedback());
		return appfeedback.getfeedback();
		  
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateFeedback(@RequestBody AppFeedback fb){
		boolean status=appfeedback.update(fb);
		if(status)
			return ResponseEntity.ok("Feedback updated successfully");
		
		return ResponseEntity.ok("feedback not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int id){
		boolean status=appfeedback.delete(id);
		if(status)
			return ResponseEntity.ok("feedback deleted succesfully");
		return ResponseEntity.ok("feedback deleted unsuccesfully");
	}
	
	@GetMapping("/recent")
	public List<AppFeedback> getRecentFeedback()
	{
		List<AppFeedback> feedlist= appfeedback.getRecentFeedbacks();
		return feedlist;
	}
	
}
