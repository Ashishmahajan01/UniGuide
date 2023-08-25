package com.uniguide.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Event;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {

	@Query(value="select * from event order by evt_schedule_on desc limit 3", nativeQuery = true)
	List<Event> getRecent();
	
	@Query(value="Select * from event order by evt_schedule_on desc",nativeQuery = true)
	List<Event> getSorted();

}
