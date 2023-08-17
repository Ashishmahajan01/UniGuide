package com.uniguide.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class AppFeedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appfeedId;
	@ManyToOne
	@JoinColumn(name="userId")
	private UserLogin userId;
	private Date appfeedDate;
	private String appfeedDesc;
	private int appfeedRating;
	
	public AppFeedback() {
		super();
	}

	public AppFeedback(int appfeedId, UserLogin userId, Date appfeedDate, String appfeedDesc, int appfeedRating) {
		super();
		this.appfeedId = appfeedId;
		this.userId = userId;
		this.appfeedDate = appfeedDate;
		this.appfeedDesc = appfeedDesc;
		this.appfeedRating = appfeedRating;
	}

	public int getAppfeedId() {
		return appfeedId;
	}

	public void setAppfeedId(int appfeedId) {
		this.appfeedId = appfeedId;
	}

	public UserLogin getUserId() {
		return userId;
	}

	public void setUserId(UserLogin userId) {
		this.userId = userId;
	}

	public Date getAppfeedDate() {
		return appfeedDate;
	}

	public void setAppfeedDate(Date appfeedDate) {
		this.appfeedDate = appfeedDate;
	}

	public String getAppfeedDesc() {
		return appfeedDesc;
	}

	public void setAppfeedDesc(String appfeedDesc) {
		this.appfeedDesc = appfeedDesc;
	}

	public int getAppfeedRating() {
		return appfeedRating;
	}

	public void setAppfeedRating(int appfeedRating) {
		this.appfeedRating = appfeedRating;
	}

	@Override
	public String toString() {
		return "AppFeedback [appfeedId=" + appfeedId + ", userId=" + userId + ", appfeedDate=" + appfeedDate
				+ ", appfeedDesc=" + appfeedDesc + ", appfeedRating=" + appfeedRating + "]";
	}

	
}
