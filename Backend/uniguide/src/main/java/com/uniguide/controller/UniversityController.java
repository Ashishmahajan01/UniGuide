package com.uniguide.controller;

import java.util.List;

import javax.websocket.server.PathParam;

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

import com.uniguide.beans.University;
import com.uniguide.service.UniversityService;

@RequestMapping("/university")
@RestController
@CrossOrigin
public class UniversityController {
	@Autowired
	private UniversityService universityService;
	
	@GetMapping("/")
	public ResponseEntity<List<University>> getAll(){
		System.out.println("inside getAll");
		List<University>ulist=universityService.getAll();
		if(ulist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(ulist);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addUniversity(@RequestBody University u){
		boolean status=universityService.addUniversity(u);
		if(status)
			return ResponseEntity.ok("University added successfully");
		return ResponseEntity.ok("University not added");
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateUniversity(@RequestBody University u){
		boolean status=universityService.update(u);
		if(status)
			return ResponseEntity.ok("University updated successfully");
		
		return ResponseEntity.ok("University not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUniversity(@PathVariable int id){
		boolean status=universityService.delete(id);
		if(status)
			return ResponseEntity.ok("University deleted succesfully");
		return ResponseEntity.ok("University deleted unsuccesfully");
		
	}
	
	

}
