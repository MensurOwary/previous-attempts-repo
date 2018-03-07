package com.owary.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.owary.springjdbc.domain.Organization;

public class OrganizationRowMapper implements RowMapper<Organization> {

	/*
	 * Actually, what this method does is, it takes the columns of the organization objects table and 
	 * creates new empty instance of it and sets the corresponding values from the table to the object and returns it
	 */
	
	public Organization mapRow(ResultSet rs, int rownum) throws SQLException {
		Organization org = new Organization();
		
		// Fields like id, companyName must be exactly like in table otherwise it won't work
		org.setId(rs.getInt("id"));
		org.setCompanyName(rs.getString("companyName"));
		org.setYearOfIncorporation(rs.getInt("yearOfIncorporation"));
		org.setPostalCode(rs.getString("postalCode"));
		org.setEmployeeCount(rs.getInt("employeeCount"));
		org.setSlogan(rs.getString("slogan"));
		
		return org;
	}

}
