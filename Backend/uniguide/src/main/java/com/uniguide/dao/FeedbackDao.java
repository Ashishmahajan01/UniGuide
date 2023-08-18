package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Feedback;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback, Integer> {
	
}
