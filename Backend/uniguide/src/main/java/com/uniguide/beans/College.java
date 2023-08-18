package com.uniguide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clgId;
	@OneToOne
	@JoinColumn(name="uniId")
	private University uniId;
	private String clgName;
	private String clgAddress;
	private String clgCity;
	private String clgState;
	private String clgWebsite;
	@Column(length=Integer.MAX_VALUE)
	private String clgDescription;
	@Column(length=Integer.MAX_VALUE)
	private String clgImg;
	public College() {
		super();
	}
	
	
	public College(int clgId) {
		super();
		this.clgId = clgId;
	}


	public College(int clgId, University uniId, String clgName, String clgAddress, String clgCity, String clgState,
			String clgWebsite, String clgDescription, String clgImg) {
		super();
		this.clgId = clgId;
		this.uniId = uniId;
		this.clgName = clgName;
		this.clgAddress = clgAddress;
		this.clgCity = clgCity;
		this.clgState = clgState;
		this.clgWebsite = clgWebsite;
		this.clgDescription = clgDescription;
		this.clgImg = clgImg;
	}
	public int getClgId() {
		return clgId;
	}
	public void setClgId(int clgId) {
		this.clgId = clgId;
	}
	public University getUniId() {
		return uniId;
	}
	public void setUniId(University uniId) {
		this.uniId = uniId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getClgAddress() {
		return clgAddress;
	}
	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}
	public String getClgCity() {
		return clgCity;
	}
	public void setClgCity(String clgCity) {
		this.clgCity = clgCity;
	}
	public String getClgState() {
		return clgState;
	}
	public void setClgState(String clgState) {
		this.clgState = clgState;
	}
	public String getClgWebsite() {
		return clgWebsite;
	}
	public void setClgWebsite(String clgWebsite) {
		this.clgWebsite = clgWebsite;
	}
	public String getClgDescription() {
		return clgDescription;
	}
	public void setClgDescription(String clgDescription) {
		this.clgDescription = clgDescription;
	}
	public String getClgImg() {
		return clgImg;
	}
	public void setClgImg(String clgImg) {
		this.clgImg = clgImg;
	}
	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", uniId=" + uniId + ", clgName=" + clgName + ", clgAddress=" + clgAddress
				+ ", clgCity=" + clgCity + ", clgState=" + clgState + ", clgWebsite=" + clgWebsite + ", clgDescription="
				+ clgDescription + ", clgImg=" + clgImg + "]";
	}
	
	
}
