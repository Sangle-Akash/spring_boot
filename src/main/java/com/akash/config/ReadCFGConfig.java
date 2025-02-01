package com.akash.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akash.entity.Employee;

public class ReadCFGConfig {
	
	public static SessionFactory readXMLFileGiveSessionFactroyObj() {
		
		Configuration configuration = new Configuration();
		
		configuration.configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		return sessionFactory;
	}
}
