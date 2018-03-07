package com.owary.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owary.spring.dao.OrganizationDao;
import com.owary.spring.domain.Organization;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationDao organizationDao;
	
	public List<Organization> getList(){
		return organizationDao.getAllOrganizations();
	}
	
}
