package com.simplilearn.test;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

//configuration
public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		try {
			StandardServiceRegistry registery= 
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			Metadata metadata= new MetadataSources(registery).getMetadataBuilder().build();
			
			sessionFactory= metadata.getSessionFactoryBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
