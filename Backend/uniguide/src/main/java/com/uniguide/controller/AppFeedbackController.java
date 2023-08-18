package com.uniguide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.AppFeedback;
import com.uniguide.service.AppFeedbackService;

@RestController
public class AppFeedbackController {
	@Autowired
	private AppFeedbackService appfeedback;
	
	
	@PostMapping("/appfeedback")
	public ResponseEntity<?> giveFeedback( @RequestBody AppFeedback fb) {
		appfeedback.giveFeedback(fb);
		  return ResponseEntity.ok(" feedback added successfully");
	}
	
	@GetMapping("/appfeedback")
	public List<AppFeedback> getFeedbackData() {
		return appfeedback.getfeedback();
		  
	}
}
