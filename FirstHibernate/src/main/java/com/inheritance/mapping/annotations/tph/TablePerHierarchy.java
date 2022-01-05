package com.inheritance.mapping.annotations.tph;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;
import com.inheritance.mapping.annotations.tph.*;
import com.inheritance.mapping.tph.ContractEmployee;
import com.inheritance.mapping.tph.Employee;
import com.inheritance.mapping.tph.RegularEmployee;

public class TablePerHierarchy {
	private static final Logger LOGGER = Logger.getLogger(TablePerHierarchy.class);

	public static void main(String[]args) {
		PropertyConfigurator.configure("log4j.properties");
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();
		
		com.inheritance.mapping.annotations.tph.Employee employee = new com.inheritance.mapping.annotations.tph.Employee();
		employee.setName("suresh");

		com.inheritance.mapping.annotations.tph.RegularEmployee regularEmployee = new com.inheritance.mapping.annotations.tph.RegularEmployee();
		regularEmployee.setName("siraj");
		regularEmployee.setBonus(9000);
		regularEmployee.setSalary(80000);

		com.inheritance.mapping.annotations.tph.ContractEmployee contractEmployee = new com.inheritance.mapping.annotations.tph.ContractEmployee();
		contractEmployee.setName("hruthik");
		contractEmployee.setContractPeriod("16 Months");
		contractEmployee.setPayPerHour(25);

		session.persist(employee);
		session.persist(regularEmployee);
		session.persist(contractEmployee);

		transaction.commit();
		session.close();
		LOGGER.warn("doNE");
	}
} 
