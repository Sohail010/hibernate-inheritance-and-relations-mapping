package com.database.hibernate;

import org.hibernate.Session;
import org.apache.log4j.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
	
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		

		Employee e1 = new Employee();
		e1.setId(2);
		e1.setFirstName("sohail");
		e1.setLastName("shaik");

		session.save(e1);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}
}