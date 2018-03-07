package com.owary.spring.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.owary.spring.domain.Project;

@Service
public class ProjectService {

	public ProjectService() {
	}

	public String getPro() {
		List<Project> ps = new ArrayList<>();
		ps.add(new Project("Sunrise"));
		ps.add(new Project("Darkfall"));
		ps.add(new Project("Hellrisen"));
		return ps.toString();
	}

}
