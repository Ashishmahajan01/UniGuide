package com.uniguide.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	
	@Column(unique = true) 
	private String emailId;
	private String password;
	private String role;
	public UserLogin() {
		super();
	}
	
	
	public UserLogin(int userId) {
		super();
		this.userId = userId;
	}


	public UserLogin(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	public UserLogin(int userId, String userName, String emailId, String password, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User_Login [userId=" + userId + ", userName=" + userName + ", emailId=" + emailId + ", password="
				+ password + ", role=" + role + "]";
	}
	
	

}
