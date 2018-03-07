package com.owary.faora.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.owary.faora.entities.Person;

public class PersonDaoImpl implements PersonDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addPerson(Person p) {

		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);

	}

	@Override
	public void updatePerson(Person p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
	}

	@Override
	public List<Person> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Person> personsList = session.createQuery("from Person").list();
		return personsList;
	}

	@Override
	public Person getPersonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}

	}

}
