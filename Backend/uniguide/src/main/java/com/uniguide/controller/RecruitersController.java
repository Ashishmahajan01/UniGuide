package com.uniguide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.Event;
import com.uniguide.beans.Recruiters;
import com.uniguide.service.RecruitersService;

@RestController
public class RecruitersController {
		
	@Autowired
	RecruitersService recruitersservice;
	
	
	
	@PostMapping("/recruitment")
	public ResponseEntity<?> driveEntry( @RequestBody Recruiters r) {
		recruitersservice.driveEntry(r);
		return ResponseEntity.ok(" drive added successfully");
	}
	
	
	@GetMapping("/recruitment")
	public List<Recruiters> getAllOngoingDrives()
	{
		List<Recruiters> elist= recruitersservice.getDrives();
		return elist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
