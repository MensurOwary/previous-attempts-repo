package com.owary.faora.dao;

import java.util.List;

import com.owary.faora.domain.Dream;

public interface DreamDAO {
	
	public void insertDream(Dream dream);
	public Dream getDreamById(int id);
	public List<Dream> getAllDreams();
	public void updateDream(Dream dream);
	public void deleteDream(int id);

}
