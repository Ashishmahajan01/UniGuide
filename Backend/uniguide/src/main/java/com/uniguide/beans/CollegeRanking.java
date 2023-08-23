package com.uniguide.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CollegeRanking {
	@Id
	private int rnkId;
	private int nirfRank;
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "clgId")
	private College clgId;
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "strmId")
	private Stream strmId;

	public CollegeRanking() {
		super();
	}

	public CollegeRanking(int rnkId) {
		super();
		this.rnkId = rnkId;
	}

	public CollegeRanking(int rnkId, int nirfRank, College clgId, Stream strmId) {
		super();
		this.rnkId = rnkId;
		this.nirfRank = nirfRank;
		this.clgId = clgId;
		this.strmId = strmId;
	}

	public int getRnkId() {
		return rnkId;
	}

	public void setRnkId(int rnkId) {
		this.rnkId = rnkId;
	}

	public int getNirfRank() {
		return nirfRank;
	}

	public void setNirfRank(int nirfRank) {
		this.nirfRank = nirfRank;
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

	@Override
	public String toString() {
		return "CollegeRanking [rnkId=" + rnkId + ", nirfRank=" + nirfRank + ", clgId=" + clgId + ", strmId=" + strmId
				+ "]";
	}

}
