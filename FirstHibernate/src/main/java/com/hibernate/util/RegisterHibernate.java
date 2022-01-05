package com.hibernate.util;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class RegisterHibernate {
	private static StandardServiceRegistry standardServiceRegistry;
	private static Metadata metadata;
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction transaction;

	public static void register() {
		standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
	}

	public static Session getSession() {
		session = sessionFactory.openSession();
		return session;

	}

	public static Transaction getTransaction() {
		transaction = session.beginTransaction();
		return transaction;

	}

}
