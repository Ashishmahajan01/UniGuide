package com.uniguide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Event;
import com.uniguide.dao.EventDao;

@Service
public class EventServiceImpl implements EventService{
	
	
	@Autowired
	private EventDao eventdao;

	@Override
	public List<Event> getEvents() {
		List<Event> elist=eventdao.findAll();
		return elist;
		
	}

}
