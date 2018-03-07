package com.owary.faora.helpers;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		try{
			Configuration config = new Configuration();
			config.addAnnotatedClass(Object.class);
			return config.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Error in Building Session Factory");
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	
}
