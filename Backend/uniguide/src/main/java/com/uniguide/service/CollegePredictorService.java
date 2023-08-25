package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.CollegePredictor;
import com.uniguide.controller.CollegePredictorController;

public interface CollegePredictorService {

	List<CollegePredictor> getAll();

	boolean add(CollegePredictor c);

	boolean update(CollegePredictor c);

	boolean delete(int id);

	List<String> getExams();

	List<CollegePredictor> getColleges(String exam);

}
