package com.owary.faora.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.owary.faora.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertUser(User user) {
		Session session = getCurrentSession();
		session.persist(user);
	}

	@Override
	public User findUserById(Integer id) {
		Session session = getCurrentSession();
		return session.get(User.class, id);
	}

	@Override
	public List<User> getAllUsers() {
		Session session = getCurrentSession();
		TypedQuery<User> query = session.createQuery("from User", User.class);
		return query.getResultList();
	}

	@Override
	public void updateUser(User user) {
		Session session = getCurrentSession();
		session.update(user);
	}

	@Override
	public void deleteUser(Integer id) {
		Session session = getCurrentSession();
		User user = session.get(User.class, id);
		if(user != null){
			session.delete(user);
		}
	}

}
