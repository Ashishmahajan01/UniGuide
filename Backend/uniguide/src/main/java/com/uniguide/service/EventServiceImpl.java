package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Event;
import com.uniguide.beans.UserLogin;
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

	@Override
	public boolean update(Event e) {
		Event ev=eventdao.getById(e.getEvtId());
		if(ev!=null) {
			ev.setEvtDescription(e.getEvtDescription());
			ev.setEvtLocation(e.getEvtLocation());
			ev.setEvtName(e.getEvtName());
			ev.setEvtOrganizer(e.getEvtOrganizer());
			ev.setEvtScheduleOn(e.getEvtScheduleOn());
			eventdao.save(ev);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<Event> el=eventdao.findById(id);
		if(el.isPresent()) {
			Event e=el.get();
			eventdao.delete(e);
		return true;
	}
		return false;
	}
	}


