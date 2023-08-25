package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Event;
import com.uniguide.beans.University;
import com.uniguide.beans.UserLogin;
import com.uniguide.dao.EventDao;

@Service
public class EventServiceImpl implements EventService{
	
	
	@Autowired
	private EventDao eventDao;

	@Override
	public List<Event> getEvents() {
		List<Event> elist=eventDao.getSorted();
		return elist;
		
	}

	@Override
	public boolean update(Event e) {
		Event ev=eventDao.getById(e.getEvtId());
		if(ev!=null) {
			ev.setEvtDescription(e.getEvtDescription());
			ev.setEvtLocation(e.getEvtLocation());
			ev.setEvtName(e.getEvtName());
			ev.setEvtOrganizer(e.getEvtOrganizer());
			ev.setEvtScheduleOn(e.getEvtScheduleOn());
			eventDao.save(ev);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<Event> el=eventDao.findById(id);
		if(el.isPresent()) {
			Event e=el.get();
			eventDao.delete(e);
		return true;
	}
		return false;
	}

	@Override
	public boolean addEvent(Event e) {
		Event evt=eventDao.save(e);
		if(evt!=null)
		return true;
		return false;
	}

	@Override
	public List<Event> getRecentEvents() {
		List<Event> elist=eventDao.getRecent();
		return elist;
	}
	}


