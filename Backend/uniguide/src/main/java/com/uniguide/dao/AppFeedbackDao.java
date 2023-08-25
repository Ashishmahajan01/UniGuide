package com.uniguide.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.AppFeedback;

@Repository
public interface AppFeedbackDao extends JpaRepository<AppFeedback, Integer> {

	@Query(value="select * from app_feedback order by appfeed_date desc limit 4",nativeQuery = true)
	List<AppFeedback> getRecent();

	@Query(value="Select * from app_feedback order by appfeed_date desc",nativeQuery = true)
	List<AppFeedback> getSorted();

}
