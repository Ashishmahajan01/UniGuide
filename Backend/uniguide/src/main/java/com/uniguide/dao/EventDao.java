package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Event;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {

}
