package com.skools.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public long id;
	@Column(name = "firstname", nullable = false, length = 50)
	public String firstName;
	@Column(name = "lastname", nullable = false, length = 50)
	public String lastName;
	@Column(name = "email", unique = true, nullable = false, length = 50)
	public String email;
	@Column(name = "phone", unique = true, nullable = false, length = 10)
	public String phone;

	public User() {
	}

	public User(String firstName2, String lastName2, String phone2, String email2) {
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.phone = phone2;
		this.email = email2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

}
