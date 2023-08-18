package com.uniguide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stream")
public class Stream {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int strmId;
	private String strmName;
	@Column(length=Integer.MAX_VALUE)
	private String strmScope;

	public Stream() {
		super();
	}

	public Stream(int strmId) {
		super();
		this.strmId = strmId;
	}

	public Stream(int strmId, String strmName, String strmScope) {
		super();
		this.strmId = strmId;
		this.strmName = strmName;
		this.strmScope = strmScope;
	}

	public int getStrmId() {
		return strmId;
	}

	public void setStrmId(int strmId) {
		this.strmId = strmId;
	}

	public String getStrmName() {
		return strmName;
	}

	public void setStrmName(String strmName) {
		this.strmName = strmName;
	}

	public String getStrmScope() {
		return strmScope;
	}

	public void setStrmScope(String strmScope) {
		this.strmScope = strmScope;
	}

	@Override
	public String toString() {
		return "Stream [strmId=" + strmId + ", strmName=" + strmName + ", strmScope=" + strmScope + "]";
	}

}
