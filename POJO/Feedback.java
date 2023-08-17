package com.uniguide.beans;

import java.sql.Date;

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
//	@ManyToOne
	//@JoinColumn(name="clgId")
//	private College clgId;
	private Date feedDate;
	private String feedDesc;
	private int feedRating;
	
}
