package com.uniguide.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.UserLogin;
import com.uniguide.service.UserLoginService;

import antlr.collections.List;



@RestController
public class UserLoginController {
	
	@Autowired
	private UserLoginService userloginservice;
	
	@PostMapping("/registration")
	public ResponseEntity<?> addUser( @RequestBody UserLogin ul) {
		userloginservice.addUser(ul);
		  return ResponseEntity.ok(" user added successfully");
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<String> validateUser(@RequestBody UserLogin u){
		UserLogin login= userloginservice.validate(u);
		if(login!=null) {
			if(login.getRole().equals("student")) {
				 return ResponseEntity.ok("Login succes  of student");
			}else if(login.getRole().equals("hr")) {
				return ResponseEntity.ok("Login Success of Hr");
			}else if(login.getRole().equals("admin")) {
				return ResponseEntity.ok("Admin logged in succesfully");
			}else if(login.getRole().equals("college")) {
				return ResponseEntity.ok("College logged in sucessfully");
			}
		}	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
	}
	
	
	
	

}
