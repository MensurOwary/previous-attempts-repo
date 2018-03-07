package com.owary.faora.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	@Column(name = "username")
	private String username;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "surname")
	private String surname;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String email;
	@Column(name = "gender")
	private String gender = "M";
	@Column(name = "birth_date")
	private Date birthDate;
	@Column(name = "avatar_url")
	private String avatar;
	
	@Transient
	private CommonsMultipartFile file;

	public User() {
	}

	public User(String username, String firstName, String surname, String password, String email, String gender,
			Date birthDate, String avatar) {
		this.username = username;
		this.firstName = firstName;
		this.surname = surname;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.birthDate = birthDate;
		this.avatar = avatar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
	
	public CommonsMultipartFile getFile() {
		return file;
	}

	public void setFile(CommonsMultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", firstName=" + firstName + ", surname=" + surname + ", password="
				+ password + ", email=" + email + ", gender=" + gender + ", birthDate=" + birthDate + ", avatar="
				+ avatar + "]";
	}

}
