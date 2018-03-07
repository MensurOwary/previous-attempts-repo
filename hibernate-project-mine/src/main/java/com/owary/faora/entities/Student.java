package com.owary.faora.entities;

import java.sql.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="birth")
	private Date birth;
	
	
/*
 * How to add collections to the database.
 * 1. There should be a database for them - consisting of at least, 2 fields as it is here.
 * 2. At least, 2 fields must be a primary key in order to prevent duplications
 */
	
	// So it is a Collection
	@ElementCollection
	// Details about the table
	@CollectionTable(
			// the name of the table for collections to be stored
			name="nicknames",
			// on which column(s) will the tables be joined?
			joinColumns=
						@JoinColumn(
								// name of the primary key in the collections table
								name="student_id", 
								// name of the key that it references to in the original table
								referencedColumnName="id"
								)
					)
	// name of the column that the actual names will be written to
	@Column(name="nickname")
	private List<String> nicknames = new LinkedList<>();
	
	// So it is a Collection
		@ElementCollection
		// Details about the table
		@CollectionTable(
				// the name of the table for collections to be stored
				name="family",
				// on which column(s) will the tables be joined?
				joinColumns=
							@JoinColumn(
									// name of the primary key in the collections table
									name="student_id", 
									// name of the key that it references to in the original table
									referencedColumnName="id"
									)
						)
		// where to store key of the map
		@MapKeyColumn(name="status")
		// name of the column that the actual names will be written to
		@Column(name="name")
	private Map<String, String> family = new HashMap<>();
	
		
	@ElementCollection
	@CollectionTable(name="student_contact", joinColumns=@JoinColumn(name="student_id", referencedColumnName="id"))
	private List<Contact> contacts = new LinkedList<>();
	
	@Embedded
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

//	public List<Lesson> getLessons() {
//		return lessons;
//	}
//
//	public void setLessons(List<Lesson> lessons) {
//		this.lessons = lessons;
//	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getNicknames() {
		return nicknames;
	}

	public void setNicknames(List<String> nicknames) {
		this.nicknames = nicknames;
	}

	public Map<String, String> getFamily() {
		return family;
	}

	public void setFamily(Map<String, String> family) {
		this.family = family;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", birth=" + birth + ", nicknames="
				+ nicknames + ", family=" + family + ", contacts=" + contacts + ", address=" + address + "]";
	}
	
	
	
	
}
