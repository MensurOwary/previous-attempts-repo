package com.owary.faora.domain;

import java.sql.Date;

public class User {
	
//	private Integer id;
	private String username;
	private String firstName;
	private String surname;
	private String password;
	private String email;
	private String gender = "M";
	
	private Date birthDate;
	private String avatar;
	
	public User() {
	}

	public User(String username, String firstName, String surname, String password, String email,
			String gender, Date birthDate, String avatar) {
		this.username = username;
		this.firstName = firstName;
		this.surname = surname;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.avatar = avatar;
	}

//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", firstName=" + firstName + ", surname=" + surname + ", password="
				+ password + ", email=" + email + ", gender=" + gender + ", birthDate=" + birthDate + ", avatar="
				+ avatar + "]";
	}
	
	
	
}
