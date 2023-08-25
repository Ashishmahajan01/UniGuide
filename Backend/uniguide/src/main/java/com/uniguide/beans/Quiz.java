package com.uniguide.beans;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quiz")
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int queId;
	private String queBody;
	private String queOpt1;
	private String queOpt2;
	private String queOpt3;
	private String queOpt4;
	private String queAns;
	private String queType;
	
	
	
	public Quiz() {
		super();
	}



	public Quiz(int queId, String queBody, String queOpt1, String queOpt2, String queOpt3, String queOpt4,
			String queAns, String queType) {
		super();
		this.queId = queId;
		this.queBody = queBody;
		this.queOpt1 = queOpt1;
		this.queOpt2 = queOpt2;
		this.queOpt3 = queOpt3;
		this.queOpt4 = queOpt4;
		this.queAns = queAns;
		this.queType = queType;
	}



	public int getQueId() {
		return queId;
	}



	public void setQueId(int queId) {
		this.queId = queId;
	}



	public String getQueBody() {
		return queBody;
	}



	public void setQueBody(String queBody) {
		this.queBody = queBody;
	}



	public String getQueOpt1() {
		return queOpt1;
	}



	public void setQueOpt1(String queOpt1) {
		this.queOpt1 = queOpt1;
	}



	public String getQueOpt2() {
		return queOpt2;
	}



	public void setQueOpt2(String queOpt2) {
		this.queOpt2 = queOpt2;
	}



	public String getQueOpt3() {
		return queOpt3;
	}



	public void setQueOpt3(String queOpt3) {
		this.queOpt3 = queOpt3;
	}



	public String getQueOpt4() {
		return queOpt4;
	}



	public void setQueOpt4(String queOpt4) {
		this.queOpt4 = queOpt4;
	}



	public String getQueAns() {
		return queAns;
	}



	public void setQueAns(String queAns) {
		this.queAns = queAns;
	}



	public String getQueType() {
		return queType;
	}



	public void setQueType(String queType) {
		this.queType = queType;
	}



	@Override
	public String toString() {
		return "McqTest [queId=" + queId + ", queBody=" + queBody + ", queOpt1=" + queOpt1 + ", queOpt2=" + queOpt2
				+ ", queOpt3=" + queOpt3 + ", queOpt4=" + queOpt4 + ", queAns=" + queAns + ", queType=" + queType + "]";
	}

	
	
	
	
	

}
