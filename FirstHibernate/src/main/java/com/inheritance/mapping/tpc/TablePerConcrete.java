package com.inheritance.mapping.tpc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;

public class TablePerConcrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();

		Employee employee = new Employee();
		employee.setName("sohail");

		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setName("suresh");
		regularEmployee.setSalary(45000);
		regularEmployee.setBonus(20000);

		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("mohan");
		contractEmployee.setPayPerHour(45);
		contractEmployee.setContractPeriod("16 months");

		session.persist(employee);
		session.persist(regularEmployee);
		session.persist(contractEmployee);

		transaction.commit();
		session.close();

	}

}
