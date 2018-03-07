package com.owary.springjdbc.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.owary.springjdbc.dao.OrganizationDao;
import com.owary.springjdbc.domain.Organization;

@Repository("orgDao")
public class OrganizationDAOImpl implements OrganizationDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		// establishing a connection...the parameters for the connection will be injected by spring...using bean definition
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean create(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public Organization getOrganization(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";
		List<Organization> list = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		return list;
	}

	public boolean delete(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(Organization org) {
		// TODO Auto-generated method stub
		return false;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
