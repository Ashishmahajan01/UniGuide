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

import com.uniguide.beans.IntakeVacancy;
import com.uniguide.beans.Stream;
import com.uniguide.service.IntakeVacancyService;

@RequestMapping("/intakevacancy")
@RestController
@CrossOrigin
public class IntakeVacancyController {
	@Autowired
	private IntakeVacancyService intakeVacancyService;

	@GetMapping("/")
	public ResponseEntity<List<IntakeVacancy>> getAll() {
		System.out.println("inside getAll");
		List<IntakeVacancy> ulist = intakeVacancyService.getAll();
		if (ulist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(ulist);
	}

	@PostMapping("/")
	public ResponseEntity<String> addUniversity(@RequestBody IntakeVacancy i) {
		boolean status = intakeVacancyService.addUniversity(i);
		if (status)
			return ResponseEntity.ok("Vacancy added successfully");
		return ResponseEntity.ok("vacany not added");
	}

	@PutMapping("/")
	public ResponseEntity<String> updateUniversity(@RequestBody IntakeVacancy i) {
		boolean status = intakeVacancyService.update(i);
		if (status)
			return ResponseEntity.ok("vacany updated successfully");

		return ResponseEntity.ok("vacany not found");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUniversity(@PathVariable int id) {
		boolean status = intakeVacancyService.delete(id);
		if (status)
			return ResponseEntity.ok("vacany deleted succesfully");
		return ResponseEntity.ok("vacany deleted unsuccesfully");

	}

}
