package com.uniguide.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Branch")
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brchId;
	private String brchName;
	private String brchDuration;

	public Branch() {
		super();
	}

	public Branch(int brchId, String brchName, String brchDuration) {
		super();
		this.brchId = brchId;
		this.brchName = brchName;
		this.brchDuration = brchDuration;
	}

	public int getBrchId() {
		return brchId;
	}

	public void setBrchId(int brchId) {
		this.brchId = brchId;
	}

	public String getBrchName() {
		return brchName;
	}

	public void setBrchName(String brchName) {
		this.brchName = brchName;
	}

	public String getBrchDuration() {
		return brchDuration;
	}

	public void setBrchDuration(String brchDuration) {
		this.brchDuration = brchDuration;
	}

	@Override
	public String toString() {
		return "Branch [brchId=" + brchId + ", brchName=" + brchName + ", brchDuration=" + brchDuration + "]";
	}

}
