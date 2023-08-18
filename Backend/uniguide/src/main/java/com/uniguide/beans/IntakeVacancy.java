package com.uniguide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "intakeVacancy")
public class IntakeVacancy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invcId;
	@ManyToOne
	@JoinColumn(name = "clgId")
	private College clgId;
	@ManyToOne
	@JoinColumn(name = "strmId")
	private Stream strmId;
	@ManyToOne
	@JoinColumn(name = "brchId")
	private Branch brchId;
	private int invcSeats;
	private float invcFees;
	@Column(length=Integer.MAX_VALUE)
	private String invcDocuments;
	private int invcVacancy;

	public IntakeVacancy() {
		super();
	}

	public IntakeVacancy(int invcId) {
		super();
		this.invcId = invcId;
	}

	public IntakeVacancy(int invcId, College clgId, Stream strmId, Branch brchId, int invcSeats, float invcFees,
			String invcDocuments, int invcVacancy) {
		super();
		this.invcId = invcId;
		this.clgId = clgId;
		this.strmId = strmId;
		this.brchId = brchId;
		this.invcSeats = invcSeats;
		this.invcFees = invcFees;
		this.invcDocuments = invcDocuments;
		this.invcVacancy = invcVacancy;
	}

	public int getInvcId() {
		return invcId;
	}

	public void setInvcId(int invcId) {
		this.invcId = invcId;
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

	public int getInvcSeats() {
		return invcSeats;
	}

	public void setInvcSeats(int invcSeats) {
		this.invcSeats = invcSeats;
	}

	public float getInvcFees() {
		return invcFees;
	}

	public void setInvcFees(float invcFees) {
		this.invcFees = invcFees;
	}

	public String getInvcDocuments() {
		return invcDocuments;
	}

	public void setInvcDocuments(String invcDocuments) {
		this.invcDocuments = invcDocuments;
	}

	public int getInvcVacancy() {
		return invcVacancy;
	}

	public void setInvcVacancy(int invcVacancy) {
		this.invcVacancy = invcVacancy;
	}

	@Override
	public String toString() {
		return "IntakeVacancy [invcId=" + invcId + ", clgId=" + clgId + ", strmId=" + strmId + ", brchId=" + brchId
				+ ", invcSeats=" + invcSeats + ", invcFees=" + invcFees + ", invcDocuments=" + invcDocuments
				+ ", invcVacancy=" + invcVacancy + "]";
	}
}
