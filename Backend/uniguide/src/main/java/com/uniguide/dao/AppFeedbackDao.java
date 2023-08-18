package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.AppFeedback;

@Repository
public interface AppFeedbackDao extends JpaRepository<AppFeedback, Integer> {

}
