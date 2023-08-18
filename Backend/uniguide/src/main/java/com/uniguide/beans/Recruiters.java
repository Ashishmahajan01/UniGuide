package com.uniguide.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Recruiters {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recuId;
	private String recuName;
	private String recuJobProfile;
	@Column(length=Integer.MAX_VALUE)
	private String recuJobDesc;
	private Date recuRegDate;
	private Date recuEndDate;
	private String recuLink;
	public Recruiters() {
		super();
	}
	public Recruiters(int recuId, String recuName, String recuJobProfile, String recuJobDesc, Date recuRegDate,
			Date recuEndDate, String recuLink) {
		super();
		this.recuId = recuId;
		this.recuName = recuName;
		this.recuJobProfile = recuJobProfile;
		this.recuJobDesc = recuJobDesc;
		this.recuRegDate = recuRegDate;
		this.recuEndDate = recuEndDate;
		this.recuLink = recuLink;
	}
	public int getRecuId() {
		return recuId;
	}
	public void setRecuId(int recuId) {
		this.recuId = recuId;
	}
	public String getRecuName() {
		return recuName;
	}
	public void setRecuName(String recuName) {
		this.recuName = recuName;
	}
	public String getRecuJobProfile() {
		return recuJobProfile;
	}
	public void setRecuJobProfile(String recuJobProfile) {
		this.recuJobProfile = recuJobProfile;
	}
	public String getRecuJobDesc() {
		return recuJobDesc;
	}
	public void setRecuJobDesc(String recuJobDesc) {
		this.recuJobDesc = recuJobDesc;
	}
	public Date getRecuRegDate() {
		return recuRegDate;
	}
	public void setRecuRegDate(Date recuRegDate) {
		this.recuRegDate = recuRegDate;
	}
	public Date getRecuEndDate() {
		return recuEndDate;
	}
	public void setRecuEndDate(Date recuEndDate) {
		this.recuEndDate = recuEndDate;
	}
	public String getRecuLink() {
		return recuLink;
	}
	public void setRecuLink(String recuLink) {
		this.recuLink = recuLink;
	}
	@Override
	public String toString() {
		return "Recruiters [recuId=" + recuId + ", recuName=" + recuName + ", recuJobProfile=" + recuJobProfile
				+ ", recuJobDesc=" + recuJobDesc + ", recuRegDate=" + recuRegDate + ", recuEndDate=" + recuEndDate
				+ ", recuLink=" + recuLink + "]";
	}
	

}
