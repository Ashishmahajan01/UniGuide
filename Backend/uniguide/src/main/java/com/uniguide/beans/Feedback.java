package com.uniguide.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedId;
	@ManyToOne
	@JoinColumn(name="studId")
	private StudentLogin studId;
	@ManyToOne
	@JoinColumn(name="clgId")
	private College clgId;
	private Date feedDate;
	@Column(length=Integer.MAX_VALUE)
	private String feedDesc;
	private int feedRating;
	public Feedback() {
		super();
	}
	public Feedback(int feedId, StudentLogin studId, College clgId, Date feedDate, String feedDesc, int feedRating) {
		super();
		this.feedId = feedId;
		this.studId = studId;
		this.clgId = clgId;
		this.feedDate = feedDate;
		this.feedDesc = feedDesc;
		this.feedRating = feedRating;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public StudentLogin getStudId() {
		return studId;
	}
	public void setStudId(StudentLogin studId) {
		this.studId = studId;
	}
	public College getClgId() {
		return clgId;
	}
	public void setClgId(College clgId) {
		this.clgId = clgId;
	}
	public Date getFeedDate() {
		return feedDate;
	}
	public void setFeedDate(Date feedDate) {
		this.feedDate = feedDate;
	}
	public String getFeedDesc() {
		return feedDesc;
	}
	public void setFeedDesc(String feedDesc) {
		this.feedDesc = feedDesc;
	}
	public int getFeedRating() {
		return feedRating;
	}
	public void setFeedRating(int feedRating) {
		this.feedRating = feedRating;
	}
	@Override
	public String toString() {
		return "Feedback [feedId=" + feedId + ", studId=" + studId + ", clgId=" + clgId + ", feedDate=" + feedDate
				+ ", feedDesc=" + feedDesc + ", feedRating=" + feedRating + "]";
	}
	
	
	
}
