package com.uniguide.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "collegeRanking")
public class Ranking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rnkId;
	@ManyToOne
	@JoinColumn(name = "clgId")
	private College clgId;
	@ManyToOne
	@JoinColumn(name = "strmId")
	private Stream strmId;
	private int nirfRank;

	public Ranking() {
		super();
	}

	public Ranking(int rnkId, College clgId, Stream strmId, int nirfRank) {
		super();
		this.rnkId = rnkId;
		this.clgId = clgId;
		this.strmId = strmId;
		this.nirfRank = nirfRank;
	}

	public int getRnkId() {
		return rnkId;
	}

	public void setRnkId(int rnkId) {
		this.rnkId = rnkId;
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

	public int getNirfRank() {
		return nirfRank;
	}

	public void setNirfRank(int nirfRank) {
		this.nirfRank = nirfRank;
	}

	@Override
	public String toString() {
		return "Ranking [rnkId=" + rnkId + ", clgId=" + clgId + ", strmId=" + strmId + ", nirfRank=" + nirfRank + "]";
	}

}
