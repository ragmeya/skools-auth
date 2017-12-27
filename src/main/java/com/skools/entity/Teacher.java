package com.skools.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher extends User {

	@Column(name = "schooltype", unique = true, nullable = false, length = 1)
	private int schoolType;
	@Column(name = "linkedin", unique = true, nullable = false, length = 100)
	private String linkedin;
	@Column(name = "facebook", unique = true, nullable = false, length = 100)
	private String facebook;
	@Column(name = "twitter", unique = true, nullable = false, length = 100)
	private String twitter;

	public Teacher(String firstName, String lastName, String email, String phone, String address,
			String aadhaar) {
		super(firstName, lastName, email, phone, address, aadhaar);
	}
	
	public int getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(int schoolType) {
		this.schoolType = schoolType;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
}