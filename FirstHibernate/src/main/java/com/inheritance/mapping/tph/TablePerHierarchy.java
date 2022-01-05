package com.inheritance.mapping.tph;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.util.RegisterHibernate;

public class TablePerHierarchy {
	private static final Logger LOGGER = Logger.getLogger(TablePerHierarchy.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		RegisterHibernate registerHibernate = new RegisterHibernate();
		registerHibernate.register();

		Employee employee = new Employee();
		employee.setName("suresh");

		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setName("siraj");
		regularEmployee.setBonus(9000);
		regularEmployee.setSalary(80000);

		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("hruthik");
		contractEmployee.setContractPeriod("16 Months");
		contractEmployee.setPayPerHour(25);

		Session session = registerHibernate.getSession();
		Transaction transaction = registerHibernate.getTransaction();

		session.persist(employee);
		session.persist(regularEmployee);
		session.persist(contractEmployee);

		transaction.commit();
		session.close();
		LOGGER.warn("Connection Done and closed");
	}

}
