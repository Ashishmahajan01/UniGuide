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

import com.uniguide.beans.Quiz;
import com.uniguide.beans.University;
import com.uniguide.service.QuizService;


@RequestMapping("/quiz")
@RestController
@CrossOrigin
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@GetMapping("/")
	public ResponseEntity<List<Quiz>> getAll(){
		System.out.println("inside getAll");
		List<Quiz>qlist=quizService.getAll();
		if(qlist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(qlist);
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addQuestion(@RequestBody Quiz q){
		boolean status=quizService.addQuestion(q);
		if(status)
			return ResponseEntity.ok("Question added successfully");
		return ResponseEntity.ok("Question not added");
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateQuestion(@RequestBody Quiz q){
		boolean status=quizService.update(q);
		if(status)
			return ResponseEntity.ok("Question updated successfully");
		
		return ResponseEntity.ok("Question not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteQuestion(@PathVariable int id){
		boolean status=quizService.delete(id);
		if(status)
			return ResponseEntity.ok("Question deleted succesfully");
		return ResponseEntity.ok("Question deleted unsuccesfully");
		
	}
	
	

}
