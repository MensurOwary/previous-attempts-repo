package com.owary.faora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.owary.faora.dao.DreamDAOImpl;
import com.owary.faora.domain.Dream;

@Service
public class DreamServiceImpl implements DreamServicee {

	@Autowired
	private DreamDAOImpl dreamDAOImpl;

	@Override
	@Transactional
	public void insertDream(Dream dream) {
		dreamDAOImpl.insertDream(dream);
	}

	@Override
	@Transactional
	public Dream getDreamById(int id) {
		return dreamDAOImpl.getDreamById(id);
	}

	@Override
	@Transactional
	public List<Dream> getAllDreams() {
		return dreamDAOImpl.getAllDreams();
	}

	@Override
	@Transactional
	public void updateDream(Dream dream) {
		dreamDAOImpl.updateDream(dream);
	}

	@Override
	@Transactional
	public void deleteDream(int id) {
		dreamDAOImpl.deleteDream(id);
	}
	
	public Dream createDream(String title, String imgUrl, String description){
		return new Dream(title,imgUrl,description);
	}

}
