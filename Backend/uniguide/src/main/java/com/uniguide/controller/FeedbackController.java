package com.uniguide.controller;

import java.util.List;

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
import com.uniguide.beans.Feedback;
import com.uniguide.service.FeedbackService;
@RequestMapping("/feedback")
@RestController
@CrossOrigin
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackservice;
	
	
	@GetMapping("/")
	public List<Feedback> getAllFeedback()
	{
		List<Feedback> flist= feedbackservice.getFeedbacks();
		return flist;
	}
	@PostMapping("/")
	public ResponseEntity<?> giveFeedback( @RequestBody Feedback fb) {
		feedbackservice.giveFeedback(fb);
		  return ResponseEntity.ok(" student feedback added successfully");
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateFeedback(@RequestBody Feedback fb){
		boolean status=feedbackservice.update(fb);
		if(status)
			return ResponseEntity.ok(" student Feedback updated successfully");
		
		return ResponseEntity.ok(" student feedback not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteFeedback(@PathVariable int id){
		boolean status=feedbackservice.delete(id);
		if(status)
			return ResponseEntity.ok(" student feedback deleted succesfully");
		return ResponseEntity.ok(" student feedback deleted unsuccesfully");
		
	}
	

}
