package com.owary.faora;

import java.sql.Date;

import org.hibernate.Session;

import com.owary.faora.entities.Address;
import com.owary.faora.entities.Contact;
import com.owary.faora.entities.Student;
import com.owary.faora.helpers.HibernateUtilUsingXML;

public class ApplicationXML2 {

	public static void main(String[] args) {

		Session session = HibernateUtilUsingXML.getSessionFactory().openSession();
		try {
			session.getTransaction().begin();

			Student student = (Student) session.get(Student.class, 6);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
