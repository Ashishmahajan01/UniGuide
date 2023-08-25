package com.uniguide.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Branch;
import com.uniguide.beans.CollegePredictor;

@Repository
public interface CollegePredictorDao extends JpaRepository<CollegePredictor, Integer>{

	@Query(value="select distinct clgpr_entrance_exam from college_predictor",nativeQuery = true)
	List<String> getExams();

	@Query(value="select c from CollegePredictor c where c.clgprEntranceExam=:exam")
	List<CollegePredictor> getColleges(String exam);

}
