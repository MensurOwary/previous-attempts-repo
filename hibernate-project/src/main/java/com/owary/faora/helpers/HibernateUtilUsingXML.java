package com.owary.faora.helpers;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.owary.faora.entities.User;

public class HibernateUtilUsingXML {

	private static SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		try{
			Configuration config = new Configuration();
			return config.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build());
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException("Error in Building Session Factory");
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	
}
