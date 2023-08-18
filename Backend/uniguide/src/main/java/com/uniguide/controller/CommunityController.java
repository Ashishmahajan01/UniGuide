package com.uniguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.service.CommunityService;

@RequestMapping("/community")
@RestController
@CrossOrigin
public class CommunityController {
        
	@Autowired
	private CommunityService communityservice;
	
	
}
