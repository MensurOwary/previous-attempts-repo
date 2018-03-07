package com.owary.spring.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.owary.spring.domain.Organization;


public class OrganizationRowMapper implements RowMapper<Organization> {

	public Organization mapRow(ResultSet rs, int rownum) throws SQLException {
		Organization org = new Organization();
		org.setId(rs.getInt("id"));
		org.setCompanyName(rs.getString("companyName"));
		org.setYearOfIncorporation(rs.getInt("yearOfIncorporation"));
		org.setPostalCode(rs.getString("postalCode"));
		org.setEmployeeCount(rs.getInt("employeeCount"));
		org.setSlogan(rs.getString("slogan"));
		
		return org;
	}

}
