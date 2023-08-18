package com.uniguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.StudentLogin;
import com.uniguide.beans.UserLogin;
import com.uniguide.service.StudentLoginService;
import com.uniguide.service.UserLoginService;

@RestController
public class StudentLoginController {
	
	
	@Autowired
	private StudentLoginService studentloginservice;
	
	@PostMapping("/studentregistration")
	public ResponseEntity<?> addStudent( @RequestBody StudentLogin sl) {
		studentloginservice.addstudent(sl);
		  return ResponseEntity.ok("student added successfully");
	}
	
	
	
	
	

}
