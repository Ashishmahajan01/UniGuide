package com.uniguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.service.CommunityService;

@RestController
public class CommunityController {
        
	@Autowired
	private CommunityService communityservice;
	
	
}
