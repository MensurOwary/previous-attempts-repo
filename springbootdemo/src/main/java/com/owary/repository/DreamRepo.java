package com.owary.repository;

import org.springframework.data.repository.CrudRepository;

import com.owary.domain.Dreams;

public interface DreamRepo extends CrudRepository<Dreams, Integer>{
	
}
