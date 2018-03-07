package com.owary.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.owary.domain.Dreams;
import com.owary.repository.DreamRepo;

@Service
public class DreamService {
	
	private DreamRepo dreamRepository;
	
	public Iterable<Dreams> getAll(){
		return dreamRepository.findAll();
	}
	
	public Dreams getDream(Integer id){
		return dreamRepository.findOne(id);		
	}
	
}
