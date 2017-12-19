package com.skools.dto;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private String firstName;

	private String lastName;

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

}
