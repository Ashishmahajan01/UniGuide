package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.*;

public interface EventService {

	List<Event> getEvents();

	boolean update(Event e);

	boolean delete(int id);

	boolean addEvent(Event e);

}
