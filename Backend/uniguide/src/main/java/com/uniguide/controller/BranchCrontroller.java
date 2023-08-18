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

import com.uniguide.beans.Branch;
import com.uniguide.service.BranchService;

@RequestMapping("/branch")
@RestController
@CrossOrigin
public class BranchCrontroller {
	@Autowired
	private BranchService branchService;

	@GetMapping
	public ResponseEntity<List<Branch>> getAllBranch() {
		List<Branch> blist = branchService.getAll();
		if (blist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(blist);
	}

	@PostMapping("/")
	public ResponseEntity<String> addBranch(@RequestBody Branch b) {
		boolean status = branchService.add(b);
		if (status)
			return ResponseEntity.ok("Branch added successfully");
		return ResponseEntity.ok("Branch not added");
	}

	@PutMapping("/")
	public ResponseEntity<String> updateBranch(@RequestBody Branch b) {
		boolean status = branchService.update(b);
		if (status)
			return ResponseEntity.ok("Branch updated successfully");
		return ResponseEntity.ok("Branch not updated");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		boolean status=branchService.delete(id);
		if(status)
			return ResponseEntity.ok("Branch deleted successfully");
		return ResponseEntity.ok("Branch not found");
	}

}
