package com.owary.faora.dao;

import java.util.List;

import com.owary.faora.domain.User;

public interface UserDAO {

	void insertUser(User user);
	User findUserById(Integer id);
	List<User> getAllUsers();
	void updateUser(User user);
	void deleteUser(Integer id);
	
	
}
