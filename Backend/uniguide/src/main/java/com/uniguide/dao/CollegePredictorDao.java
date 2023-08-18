package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Branch;
import com.uniguide.beans.CollegePredictor;

@Repository
public interface CollegePredictorDao extends JpaRepository<CollegePredictor, Integer>{

}
