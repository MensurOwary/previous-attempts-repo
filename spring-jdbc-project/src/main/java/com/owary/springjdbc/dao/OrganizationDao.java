package com.owary.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.owary.springjdbc.domain.Organization;

public interface OrganizationDao {
	
	// It is necessary for establishing the connection
	void setDataSource(DataSource ds);
	
	// Creating a record in the database
	boolean create(Organization org);
	
	// Retrieve a single object from the database
	Organization getOrganization(Integer id);
	
	// Getting all the objects from the database
	List<Organization> getAllOrganizations();

	// Deleting a record
	boolean delete(Organization org);
	
	// updating a record
	boolean update(Organization org);
	
	// Truncating the table
	void cleanup();
}
