package com.skools.dto;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private String firstName;

	private String lastName;

	private String phone;

	private String email;

	private String aadhaar;

	private String address;

	private String linkedin;

	private String facebook;
	
	private String twitter;

	private String schoolType;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public String getAadhaar() {
		return aadhaar;
	}

	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
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

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}
	
}