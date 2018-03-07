package com.owary.faora.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.owary.faora.dao.DreamDAOImpl;
import com.owary.faora.domain.Dream;

@Service
public class DreamServiceImpl implements DreamService {

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
	
	public List<List<Dream>> divideIntoFour(List<Dream> list) {
		List<List<Dream>> list_new = new LinkedList<>();

		int step = (list.size() / 4) + 1;

		for (int i = 0; i < list.size(); i += step) {
			int from = i;
			int to;
			if (i + step < list.size()) {
				to = i + step;
			} else {
				to = list.size();
			}
			list_new.add(list.subList(from, to));
		}

		return list_new;
	}
	
	public String handleFileUpload(CommonsMultipartFile file, HttpSession session){
		
		ServletContext context = session.getServletContext();
		String path = context.getRealPath("/resources/uploads/");
		String filename = file.getOriginalFilename();
		
		try {
			byte[] bytes = file.getBytes();
			File myFile = new File(path + File.separator + filename);
			BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(myFile));
			stream.write(bytes);
			stream.flush();
			stream.close();

		} catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException("Error while File Uploading...");
		}

		String link = "/resources/uploads/"+filename;
		return link;
	}
	
	

}
