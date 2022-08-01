package com.TouristRegistration.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TouristForm")
public class Tourist {
	
	@Id
	@Column(name = "id")
	private int tId;
	
	@Column(name = "firstname")
	private String tfName;
	
	@Column(name = "lastname")
	private String tlName;
	
	@Column(name = "gender")
	private String tGender;
	
	@Column(name = "age")
	private int tAge;
	
	@Column(name = "location")
	private String tLocation;
	
	@Column(name = "totaldays")
	private int totalDays;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getTfName() {
		return tfName;
	}

	public void setTfName(String tfName) {
		this.tfName = tfName;
	}

	public String getTlName() {
		return tlName;
	}

	public void setTlName(String tlName) {
		this.tlName = tlName;
	}

	public String gettGender() {
		return tGender;
	}

	public void settGender(String tGender) {
		this.tGender = tGender;
	}

	public int gettAge() {
		return tAge;
	}

	public void settAge(int tAge) {
		this.tAge = tAge;
	}

	public String gettLocation() {
		return tLocation;
	}

	public void settLocation(String tLocation) {
		this.tLocation = tLocation;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public Tourist(int tId, String tfName, String tlName, String tGender, int tAge, String tLocation, int totalDays) {
		super();
		this.tId = tId;
		this.tfName = tfName;
		this.tlName = tlName;
		this.tGender = tGender;
		this.tAge = tAge;
		this.tLocation = tLocation;
		this.totalDays = totalDays;
	}

	public Tourist() {
		super();
	}

	

}
