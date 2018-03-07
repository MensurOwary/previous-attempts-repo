package com.owary.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.owary.springjdbc.dao.OrganizationDao;
import com.owary.springjdbc.daoimpl.OrganizationDAOImpl;
import com.owary.springjdbc.domain.Organization;

public class JdbcApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		OrganizationDao orgDao = (OrganizationDAOImpl) ctx.getBean("orgDao");
		List<Organization> list = orgDao.getAllOrganizations();
		
		list.forEach(item->System.out.println(item));

		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
