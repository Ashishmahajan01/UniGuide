package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer>{

}



