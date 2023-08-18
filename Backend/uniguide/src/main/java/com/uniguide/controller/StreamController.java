package com.uniguide.controller;

import java.util.List;

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

import com.uniguide.beans.Stream;
import com.uniguide.service.StreamService;

@RequestMapping("/stream")
@RestController
@CrossOrigin
public class StreamController {
	@Autowired
	private StreamService streamService;
	
	@GetMapping("/")
	public ResponseEntity<List<Stream>> getAll(){
		System.out.println("inside getAll");
		List<Stream>ulist=streamService.getAll();
		if(ulist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(ulist);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addStream(@RequestBody Stream s){
		boolean status=streamService.addStream(s);
		if(status)
			return ResponseEntity.ok("Stream added successfully");
		return ResponseEntity.ok("Stream not added");
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateStream(@RequestBody Stream s){
		boolean status=streamService.update(s);
		if(status)
			return ResponseEntity.ok("Stream updated successfully");
		
		return ResponseEntity.ok("Stream not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStream(@PathVariable int id){
		boolean status=streamService.delete(id);
		if(status)
			return ResponseEntity.ok("Stream deleted succesfully");
		return ResponseEntity.ok("Stream deleted unsuccesfully");
		
	}
	

}
