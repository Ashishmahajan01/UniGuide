package com.uniguide.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int evtId;
	private String evtName;
	private String evtLocation;
	private Date evtScheduleOn;
	private String evtDescription;
	private String evtOrganizer;
	public Event() {
		super();
	}
	public Event(int evtId, String evtName, String evtLocation, Date evtScheduleOn, String evtDescription,
			String evtOrganizer) {
		super();
		this.evtId = evtId;
		this.evtName = evtName;
		this.evtLocation = evtLocation;
		this.evtScheduleOn = evtScheduleOn;
		this.evtDescription = evtDescription;
		this.evtOrganizer = evtOrganizer;
	}
	public int getEvtId() {
		return evtId;
	}
	public void setEvtId(int evtId) {
		this.evtId = evtId;
	}
	public String getEvtName() {
		return evtName;
	}
	public void setEvtName(String evtName) {
		this.evtName = evtName;
	}
	public String getEvtLocation() {
		return evtLocation;
	}
	public void setEvtLocation(String evtLocation) {
		this.evtLocation = evtLocation;
	}
	public Date getEvtScheduleOn() {
		return evtScheduleOn;
	}
	public void setEvtScheduleOn(Date evtScheduleOn) {
		this.evtScheduleOn = evtScheduleOn;
	}
	public String getEvtDescription() {
		return evtDescription;
	}
	public void setEvtDescription(String evtDescription) {
		this.evtDescription = evtDescription;
	}
	public String getEvtOrganizer() {
		return evtOrganizer;
	}
	public void setEvtOrganizer(String evtOrganizer) {
		this.evtOrganizer = evtOrganizer;
	}
	@Override
	public String toString() {
		return "Event [evtId=" + evtId + ", evtName=" + evtName + ", evtLocation=" + evtLocation + ", evtScheduleOn="
				+ evtScheduleOn + ", evtDescription=" + evtDescription + ", evtOrganizer=" + evtOrganizer + "]";
	}
	
}
