package com.owary.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.owary.springjdbc.dao.OrganizationDao;
import com.owary.springjdbc.daoimpl.OrganizationDAOImpl;
import com.owary.springjdbc.domain.Organization;

public class JdbcApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		OrganizationDao orgDao = (OrganizationDAOImpl) ctx.getBean("orgDao");
				
//		Organization org = new Organization("MSI", 1998, "US456", 4582, "Release the Kraken!");
//		
//		orgDao.create(org);
		
		
//		Organization org = orgDao.getOrganization(4);
//		org.setSlogan("Best Workstations and Gaming Ultrabooks");
//		org.setYearOfIncorporation(2005);
//		orgDao.update(org);
		
		
		Organization org = orgDao.getOrganization(4);
		orgDao.delete(org);
		
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
