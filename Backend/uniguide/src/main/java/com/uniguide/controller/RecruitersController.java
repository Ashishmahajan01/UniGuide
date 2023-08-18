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

import com.uniguide.beans.Branch;
import com.uniguide.beans.Event;
import com.uniguide.beans.Recruiters;
import com.uniguide.service.RecruitersService;


@RequestMapping("/recruitment")
@RestController
@CrossOrigin
public class RecruitersController {
		
	@Autowired
	RecruitersService recruitersservice;
	
	
	
	@PostMapping("/")
	public ResponseEntity<?> driveEntry( @RequestBody Recruiters r) {
		recruitersservice.driveEntry(r);
		return ResponseEntity.ok(" drive added successfully");
	}
	
	
	@GetMapping("/")
	public List<Recruiters> getAllOngoingDrives()
	{
		List<Recruiters> elist= recruitersservice.getDrives();
		return elist;
	}
	
	
	@PutMapping("/")
	public ResponseEntity<String> updateDrive(@RequestBody Recruiters r) {
		boolean status = recruitersservice.update(r);
		if (status)
			return ResponseEntity.ok("drive  updated successfully");
		return ResponseEntity.ok("drive not updated");
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		boolean status=recruitersservice.delete(id);
		if(status)
			return ResponseEntity.ok("recuDrive  deleted successfully");
		return ResponseEntity.ok("recuDrive not found");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
