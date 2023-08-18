package com.uniguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.Feedback;
import com.uniguide.service.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackservice;
	
	@PostMapping("/feedback")
	public ResponseEntity<?> giveFeedback( @RequestBody Feedback fb) {
		feedbackservice.giveFeedback(fb);
		  return ResponseEntity.ok(" student feedback added successfully");
	}
	

}
