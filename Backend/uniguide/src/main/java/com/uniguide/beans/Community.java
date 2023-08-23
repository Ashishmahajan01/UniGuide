package com.uniguide.beans;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Community {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commId;
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name="studId")
	private StudentLogin studId;
	@Column(length=Integer.MAX_VALUE)
	private String commAsk;
	private Date commAskDate;
	private String commAskType;
	public Community() {
		super();
	}
	public Community(int commId, StudentLogin studId, String commAsk, Date commAskDate, String commAskType) {
		super();
		this.commId = commId;
		this.studId = studId;
		this.commAsk = commAsk;
		this.commAskDate = commAskDate;
		this.commAskType = commAskType;
	}
	public int getCommId() {
		return commId;
	}
	public void setCommId(int commId) {
		this.commId = commId;
	}
	public StudentLogin getStudId() {
		return studId;
	}
	public void setStudId(StudentLogin studId) {
		this.studId = studId;
	}
	public String getCommAsk() {
		return commAsk;
	}
	public void setCommAsk(String commAsk) {
		this.commAsk = commAsk;
	}
	public Date getCommAskDate() {
		return commAskDate;
	}
	public void setCommAskDate(Date commAskDate) {
		this.commAskDate = commAskDate;
	}
	public String getCommAskType() {
		return commAskType;
	}
	public void setCommAskType(String commAskType) {
		this.commAskType = commAskType;
	}
	@Override
	public String toString() {
		return "Community [commId=" + commId + ", studId=" + studId + ", commAsk=" + commAsk + ", commAskDate="
				+ commAskDate + ", commAskType=" + commAskType + "]";
	}
	
	
	

}
