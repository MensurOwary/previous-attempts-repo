package com.owary.faora.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.owary.faora.domain.Dream;

@Repository
public class DreamDAOImpl implements DreamDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertDream(Dream dream) {
		Session session = getCurrentSession();
		session.persist(dream);
	}

	@Override
	public Dream getDreamById(int id) {
		Session session = getCurrentSession();
		Dream dream = (Dream)session.get(Dream.class, id);
		System.out.println(dream);
		return dream;
	}

	@Override
	public List<Dream> getAllDreams() {
		Session session = getCurrentSession();
		TypedQuery<Dream> query = session.createQuery("from Dream", Dream.class);
		return query.getResultList();
	}

	@Override
	public void updateDream(Dream dream) {
		Session session = getCurrentSession();
		session.update(dream);
	}

	@Override
	public void deleteDream(int id) {
		Session session = getCurrentSession();
		Dream d = (Dream) session.get(Dream.class, new Integer(id));
		System.out.println(d);
		if (d != null) {
			session.delete(d);
		}

	}

}
