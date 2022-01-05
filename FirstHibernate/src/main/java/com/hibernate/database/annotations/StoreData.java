package com.hibernate.database.annotations;

import org.hibernate.Session;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData {

	public static void main(String[] args) {
	final Logger LOGGER = Logger.getLogger(StoreData.class);
		PropertyConfigurator.configure("log4j.properties");
		LOGGER.debug("java");
		LOGGER.warn("Debugging");
		LOGGER.warn("Java hacked");
		LOGGER.error("error");
		LOGGER.fatal("fatal");

		/*
		 * StandardServiceRegistry standardServiceRegistry = new
		 * StandardServiceRegistryBuilder() .configure("hibernate.cfg.xml").build();
		 * Metadata metadata = new
		 * MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		 * 
		 * SessionFactory factory = metadata.getSessionFactoryBuilder().build(); Session
		 * session = factory.openSession(); Transaction t = session.beginTransaction();
		 * 		 * Employee employee = new Employee(); // Employee employee = new Employee();
		 * employee.setId(8); employee.setFirstName("jeff");
		 * employee.setLastName("bessos");
		 * 
		 * session.save(employee); t.commit(); System.out.println("successfully saved");
		 * factory.close(); session.close();
		 */

	}
}