package com.owary.faora;

import java.util.Date;

import org.hibernate.Session;

import com.owary.faora.entities.User;
import com.owary.faora.helpers.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		
		User user = new User();
		
		user.setFirstName("Faora");
		user.setLastName("UI");
		user.setEmailAddress("faora@krypton.kr");
		user.setBirthDate(new Date());
		user.setCreatedBy("The Presence");
		user.setCreatedDate(new Date());
		user.setLastUpdatedBy("Zod");
		user.setLastUpdatedDate(new Date());
		
		session.save(user);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
