package com.owary.faora;

import java.sql.Date;

import org.hibernate.Session;

import com.owary.faora.entities.Address;
import com.owary.faora.entities.Contact;
import com.owary.faora.entities.Student;
import com.owary.faora.helpers.HibernateUtilUsingXML;

public class ApplicationXML {

	public static void main(String[] args) {

		Session session = HibernateUtilUsingXML.getSessionFactory().openSession();
		try {
			session.getTransaction().begin();

			Student student = new Student();

			Address address = new Address();

			student.setName("Clark");
			student.setSurname("Kent");
			student.setBirth(new Date(68113852));

			student.getNicknames().add("Superman");
			student.getNicknames().add("Man of Steel");
			student.getNicknames().add("Man of Tomorrow");

			student.getFamily().put("father", "Jonathan");
			student.getFamily().put("mother", "Martha");

			address.setAddressLine("123 Main Street");
			address.setCity("Metropolis");
			address.setZip("MM2017");
			student.setAddress(address);
			
			Contact c1 = new Contact(); c1.setHomeNumber("555555"); c1.setMobileNumber("11111111"); c1.setEmail("ex@e.com");
			Contact c2 = new Contact(); c2.setHomeNumber("444444"); c2.setMobileNumber("22222222"); c2.setEmail("c2@e.com");
			
			student.getContacts().add(c1);
			student.getContacts().add(c2);

			session.save(student);

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
