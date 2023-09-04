package com.uniguide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="university")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uniId;
	private String uniName;
	private int uniRank;
	@Column(length=Integer.MAX_VALUE)
	private String uniAddress;
	private String uniCity;
	private String uniState;
	@Column(length=Integer.MAX_VALUE)
	private String uniDescription;
	@Column(length=Integer.MAX_VALUE)
	private String uniImg;

	public University() {
		super();
	}
	public University(int uniId) {
		super();
		this.uniId = uniId;
	}

	public University(int uniId, String uniName, int uniRank, String uniAddress, String uniCity, String uniState,
			String uniDescription, String uniImg) {
		super();
		this.uniId = uniId;
		this.uniName = uniName;
		this.uniRank = uniRank;
		this.uniAddress = uniAddress;
		this.uniCity = uniCity;
		this.uniState = uniState;
		this.uniDescription = uniDescription;
		this.uniImg = uniImg;
	}

	public int getUniId() {
		return uniId;
	}

	public void setUniId(int uniID) {
		this.uniId = uniID;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public int getUniRank() {
		return uniRank;
	}

	public void setUniRank(int uniRank) {
		this.uniRank = uniRank;
	}

	public String getUniAddress() {
		return uniAddress;
	}

	public void setUniAddress(String uniAddress) {
		this.uniAddress = uniAddress;
	}

	public String getUniCity() {
		return uniCity;
	}

	public void setUniCity(String uniCity) {
		this.uniCity = uniCity;
	}

	public String getUniState() {
		return uniState;
	}

	public void setUniState(String uniState) {
		this.uniState = uniState;
	}

	public String getUniDescription() {
		return uniDescription;
	}

	public void setUniDescription(String uniDescription) {
		this.uniDescription = uniDescription;
	}

	public String getUniImg() {
		return uniImg;
	}

	public void setUniImg(String uniImg) {
		this.uniImg = uniImg;
	}

	@Override
	public String toString() {
		return "University [uniId=" + uniId + ", uniName=" + uniName + ", uniRank=" + uniRank + ", uniAddress="
				+ uniAddress + ", uniCity=" + uniCity + ", uniState=" + uniState + ", uniDescription=" + uniDescription
				+ ", uniImg=" + uniImg + "]";
	}

}
