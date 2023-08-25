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

import com.uniguide.beans.CollegePredictor;
import com.uniguide.service.CollegePredictorService;
import com.uniguide.service.CollegeService;

@RequestMapping("/collegepredictor")
@RestController
@CrossOrigin
public class CollegePredictorController {
	
	@Autowired
	private CollegePredictorService collegePredictorService;
	
	
	@GetMapping("/")
	public ResponseEntity<List<CollegePredictor>> getAll(){
		List<CollegePredictor> clist=collegePredictorService.getAll();
		if(clist.isEmpty())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.ok(clist);

	}
	
	@PostMapping("/")
	public ResponseEntity<String> add(@RequestBody CollegePredictor c){
		boolean status=collegePredictorService.add(c);
		if(status)
			return ResponseEntity.ok("College Marks details added successfully");
		return ResponseEntity.ok("College mark details cannot be added");
	}

	@PutMapping("/")
	public ResponseEntity<String> update(@RequestBody CollegePredictor c){
		boolean status=collegePredictorService.update(c);
		if(status)
			return ResponseEntity.ok("College Marks details updated successfully");
		return ResponseEntity.ok("College mark details cannot be added");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		boolean status=collegePredictorService.delete(id);
		if(status)
			return ResponseEntity.ok("College Marks deleted successfully");
		return ResponseEntity.ok("College mark details cannot be deleted");
	}
	
	@GetMapping("/exams")
	public ResponseEntity<List<String>> getExams(){
		List<String> elist=collegePredictorService.getExams();
		return ResponseEntity.ok(elist);
	}
	
	@GetMapping("/exams/{exam}")
	public ResponseEntity<List<CollegePredictor>> getColleges(@PathVariable String exam){
		System.out.println(exam);
		List<CollegePredictor> clist=collegePredictorService.getColleges(exam);
		return ResponseEntity.ok(clist);
	}

}
