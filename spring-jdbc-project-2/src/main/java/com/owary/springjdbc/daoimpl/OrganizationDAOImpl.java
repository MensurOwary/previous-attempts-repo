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
		/*
		 * Here in sqlQuery variable we write our arbitrary SQL query...
		 */
		String sqlQuery = "INSERT INTO organization VALUES (null, ?, ?, ?, ?, ?)";
		/*
		 * Here, we declare a new args array of objects and pass the values based on the given Organization object, 
		 * respectively to the question marks and their indicated fields
		 * Since all the classes extends the main Object class, it doesn't throw an exception or any kind of error 
		 */
		Object[] args = new Object[]{
				org.getCompanyName(),
				org.getYearOfIncorporation(),
				org.getPostalCode(),
				org.getEmployeeCount(), 
				org.getSlogan()				
		};
		/*
		 * Here while returning we check if it is equal to 1...
		 * update(sql, Object array of given values) is a method in JdbcTemplate class
		 */
		return jdbcTemplate.update(sqlQuery, args)==1;
	}
	
	public Organization getOrganization(Integer id) {
		/*
		 * SQL query for retrieving an element in the indicated id
		 */
		String sql = "SELECT * from organization WHERE id = ?";
		/*
		 * args array of Objects for replacing the question mark placeholders in sql query
		 */
		Object[] args = new Object[]{id};
		/*
		 * Retrieving and saving the object using queryForObject(SQL query, parameter array, Row Mapper) method 
		 * which returns an object
		 */
		Organization org = jdbcTemplate.queryForObject(sql, args, new OrganizationRowMapper());
		return org;
	}

	public List<Organization> getAllOrganizations() {
		/*
		 * SQL query for getting all the organizations
		 */
		String sqlQuery = "SELECT * FROM organization";
		/*
		 * Since query(sql, Row Mapper) method returns a List of Organizations, we save it in List object and return it
		 */
		List<Organization> list = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		return list;
	}

	public boolean delete(Organization org) {
		/*
		 * SQL query for deleting an entry in the indicating id
		 */
		String sql = "DELETE FROM organization WHERE id = ?";
		/*
		 * Pass the arguments which are required as question marks in sql query variable
		 */
		Object[] args = new Object[]{org.getId()};
		/*
		 * as update method returns the number of rows affected and since we are deleting only one object, it should return 1 and
		 * if the returned value is equal to 1,then it returns true and vice versa
		 */
		return jdbcTemplate.update(sql, args)==1;
	}

	public boolean update(Organization org) {
		/*
		 * Sql query for updating all the fields of the indicated row
		 */
		String sql = "UPDATE organization SET companyName = ?, "
				+ "yearOfIncorporation = ?, "
				+ "postalCode = ?, "
				+ "employeeCount = ?, "
				+ "slogan= ? "
				+ "WHERE id = ?";
		/*
		 * Arguments passed as an object array and placed in order as the sql query requires(sql variable) 
		 */
		Object[] args = new Object[]{
				org.getCompanyName(),			
				org.getYearOfIncorporation(),
				org.getPostalCode(),
				org.getEmployeeCount(),
				org.getSlogan(),
				org.getId()
		};
		/*
		 * as update method returns the number of rows affected and since we are updating only one object, it should return 1 and
		 * if the returned value is equal to 1,then it returns true and vice versa
		 */
		return jdbcTemplate.update(sql, args)==1;
	}

	public void cleanup() {
		/*
		 * cleanup() method just truncates the table and deletes all the elements while restores the auto_increment in id
		 */
		String sqlQuery = "TRUNCATE TABLE organization";
		/*
		 * execute() method executes any kind of arbitrary sql query...
		 * execute() method is mostly used for static sql queries - DROP, TRUNCATE, etc.
		 */
		jdbcTemplate.execute(sqlQuery);
	}

}
