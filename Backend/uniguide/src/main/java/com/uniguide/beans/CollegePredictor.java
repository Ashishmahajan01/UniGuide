package com.uniguide.beans;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Formula;

@Entity
public class CollegePredictor {

	@Id
	private int clgprId;
	@ManyToOne
	@JoinColumn(name = "clgId")
	private College clgId;
	@ManyToOne
	@JoinColumn(name = "strmId")
	private Stream strmId;
	@ManyToOne
	@JoinColumn(name = "brchId")
	private Branch brchId;
	private String clgprEntranceExam;
	@Column(name = "clgprY1")
	private float clgprY1;
	@Column(name = "clgprY2")
	private float clgprY2;
	@Column(name = "clgprY3")
	private float clgprY3;
	@Column(name = "clgprY4")
	private float clgprY4;
	@Column(name = "clgprY5")
	private float clgprY5;
	//@Generated(value = "(clgprY1 * 0.2 + clgprY2 * 0.4 + clgprY3 * 0.6 + clgprY4 * 0.8 + clgprY5) / 3")
	@GeneratedValue
	@Formula(value = "(clgprY1 * 0.2 + clgprY2 * 0.4 + clgprY3 * 0.6 + clgprY4 * 0.8 + clgprY5) / 3")
	private float average;

	public CollegePredictor() {
		super();
	}

	public CollegePredictor(int clgprId, College clgId, Stream strmId, Branch brchId, String clgprEntranceExam,
			float clgprY1, float clgprY2, float clgprY3, float clgprY4, float clgprY5, float average) {
		super();
		this.clgprId = clgprId;
		this.clgId = clgId;
		this.strmId = strmId;
		this.brchId = brchId;
		this.clgprEntranceExam = clgprEntranceExam;
		this.clgprY1 = clgprY1;
		this.clgprY2 = clgprY2;
		this.clgprY3 = clgprY3;
		this.clgprY4 = clgprY4;
		this.clgprY5 = clgprY5;
		this.average = average;
	}

	public int getClgprId() {
		return clgprId;
	}

	public void setClgprId(int clgprId) {
		this.clgprId = clgprId;
	}

	public College getClgId() {
		return clgId;
	}

	public void setClgId(College clgId) {
		this.clgId = clgId;
	}

	public Stream getStrmId() {
		return strmId;
	}

	public void setStrmId(Stream strmId) {
		this.strmId = strmId;
	}

	public Branch getBrchId() {
		return brchId;
	}

	public void setBrchId(Branch brchId) {
		this.brchId = brchId;
	}

	public String getClgprEntranceExam() {
		return clgprEntranceExam;
	}

	public void setClgprEntranceExam(String clgprEntranceExam) {
		this.clgprEntranceExam = clgprEntranceExam;
	}

	public float getClgprY1() {
		return clgprY1;
	}

	public void setClgprY1(float clgprY1) {
		this.clgprY1 = clgprY1;
	}

	public float getClgprY2() {
		return clgprY2;
	}

	public void setClgprY2(float clgprY2) {
		this.clgprY2 = clgprY2;
	}

	public float getClgprY3() {
		return clgprY3;
	}

	public void setClgprY3(float clgprY3) {
		this.clgprY3 = clgprY3;
	}

	public float getClgprY4() {
		return clgprY4;
	}

	public void setClgprY4(float clgprY4) {
		this.clgprY4 = clgprY4;
	}

	public float getClgprY5() {
		return clgprY5;
	}

	public void setClgprY5(float clgprY5) {
		this.clgprY5 = clgprY5;
	}

	public float getAverage() {
		return average;
	}

	public void setAverage(float average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "CollegePredictor [clgprId=" + clgprId + ", clgId=" + clgId + ", strmId=" + strmId + ", brchId=" + brchId
				+ ", clgprEntranceExam=" + clgprEntranceExam + ", clgprY1=" + clgprY1 + ", clgprY2=" + clgprY2
				+ ", clgprY3=" + clgprY3 + ", clgprY4=" + clgprY4 + ", clgprY5=" + clgprY5 + ", average=" + average
				+ "]";
	}

}
