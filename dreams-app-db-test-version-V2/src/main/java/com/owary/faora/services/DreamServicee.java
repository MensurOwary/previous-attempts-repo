package com.owary.faora.services;

import java.util.List;

import com.owary.faora.domain.Dream;

public interface DreamServicee {
	
	public void insertDream(Dream dream);
	public Dream getDreamById(int id);
	public List<Dream> getAllDreams();
	public void updateDream(Dream dream);
	public void deleteDream(int id);

}
