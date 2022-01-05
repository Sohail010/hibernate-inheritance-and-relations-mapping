package com.inheritance.mapping.annotations.tpsc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;

public class TablePerSubClass {

	public static void main(String[]args) {
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();
		Employee employee = new Employee();
		employee.setName("raja");
		
		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setName("vishnu");
		regularEmployee.setSalary(30000);
		regularEmployee.setBonus(1200);
		
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("balaji");
		contractEmployee.setPayPerHour(12);
		contractEmployee.setContractPeriod("3 months");
		
		session.persist(employee);
		session.persist(regularEmployee);
		session.persist(contractEmployee);
		
		transaction.commit();
		session.close();
		
	}
}
