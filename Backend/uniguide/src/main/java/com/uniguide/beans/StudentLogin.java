package com.uniguide.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class StudentLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studId;
	@OneToOne()
	@JoinColumn(name="userId")
	private UserLogin userId;
	private String studFirstName;
	private String studLastName;
	private String studCity;
	private String studState;
	private String studQualification;
	private String studEntranceExam;
	private int studExamScore;
	private int clgId;

	public StudentLogin() {
		super();
	}

	public StudentLogin(int studId, UserLogin userId, String studFirstName, String studLastName, String studCity,
			String studState, String studQualification, String studEntranceExam, int studExamScore, int clgId) {
		super();
		this.studId = studId;
		this.userId = userId;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studCity = studCity;
		this.studState = studState;
		this.studQualification = studQualification;
		this.studEntranceExam = studEntranceExam;
		this.studExamScore = studExamScore;
		this.clgId = clgId;
	}
	

	public StudentLogin(int studId) {
		super();
		this.studId = studId;
	}
	
	

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public UserLogin getUserId() {
		return userId;
	}

	public void setUserId(UserLogin userId) {
		this.userId = userId;
	}

	public String getStudFirstName() {
		return studFirstName;
	}

	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}

	public String getStudLastName() {
		return studLastName;
	}

	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public String getStudState() {
		return studState;
	}

	public void setStudState(String studState) {
		this.studState = studState;
	}

	public String getStudQualification() {
		return studQualification;
	}

	public void setStudQualification(String studQualification) {
		this.studQualification = studQualification;
	}

	public String getStudEntranceExam() {
		return studEntranceExam;
	}

	public void setStudEntranceExam(String studEntranceExam) {
		this.studEntranceExam = studEntranceExam;
	}

	public int getStudExamScore() {
		return studExamScore;
	}

	public void setStudExamScore(int studExamScore) {
		this.studExamScore = studExamScore;
	}

	public int getClgId() {
		return clgId;
	}

	public void setClgId(int clgId) {
		this.clgId = clgId;
	}

	@Override
	public String toString() {
		return "StudentLogin [studId=" + studId + ", userId=" + userId + ", studFirstName=" + studFirstName
				+ ", studLastName=" + studLastName + ", studCity=" + studCity + ", studState=" + studState
				+ ", studQualification=" + studQualification + ", studEntranceExam=" + studEntranceExam
				+ ", studExamScore=" + studExamScore + ", clgId=" + clgId + "]";
	}
	

	


}
