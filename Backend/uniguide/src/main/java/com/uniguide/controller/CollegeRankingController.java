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
import com.uniguide.beans.CollegeRanking;
import com.uniguide.service.CollegeRankingService;

@RequestMapping("/collegeranking")
@RestController
@CrossOrigin
public class CollegeRankingController {
	@Autowired
	private CollegeRankingService collegeRankingService;

	@GetMapping
	public ResponseEntity<List<CollegeRanking>> getAllBranch() {
		List<CollegeRanking> blist = collegeRankingService.getAll();
		if (blist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(blist);
	}

	@PostMapping("/")
	public ResponseEntity<String> addBranch(@RequestBody CollegeRanking cr) {
		boolean status = collegeRankingService.add(cr);
		if (status)
			return ResponseEntity.ok("College Ranking added successfully");
		return ResponseEntity.ok("College Ranking not added");
	}

	@PutMapping("/")
	public ResponseEntity<String> updateBranch(@RequestBody CollegeRanking cr) {
		boolean status = collegeRankingService.update(cr);
		if (status)
			return ResponseEntity.ok("College Ranking updated successfully");
		return ResponseEntity.ok("College Ranking not updated");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		boolean status = collegeRankingService.delete(id);
		if (status)
			return ResponseEntity.ok("College Ranking deleted successfully");
		return ResponseEntity.ok("College Ranking not found");
	}

}
