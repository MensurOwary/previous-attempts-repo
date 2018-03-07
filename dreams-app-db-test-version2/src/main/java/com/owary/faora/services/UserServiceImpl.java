package com.owary.faora.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.owary.faora.dao.UserDAOImpl;
import com.owary.faora.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAOImpl userDao;

	@Override
	@Transactional
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	@Transactional
	public User findUserById(Integer id) {
		return userDao.findUserById(id);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	@Transactional
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}

	public String handleFileUpload(CommonsMultipartFile file, HttpSession session) {

		ServletContext context = session.getServletContext();
		String path = context.getRealPath("/resources/uploads/");
		System.out.println(path);
		String filename = file.getOriginalFilename();
		System.out.println(filename);

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

		String link = "/resources/uploads/" + filename;
		return link;
	}

	public String handleImageResizeAndUpload(CommonsMultipartFile file, HttpSession session) {
		
		handleFileUpload(file, session);

		ServletContext context = session.getServletContext();
		String path = context.getRealPath("/resources/uploads/");
		String filename = file.getOriginalFilename();

		try {
			String fullPath = (path + filename).replace("\\", "\\\\");
			System.out.println(fullPath);
			String link = ImageResizer.resizeAndUpload(fullPath);
			System.out.println(link);
			return link;
		} catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException("Error while File Uploading...");
		}

	}

}
