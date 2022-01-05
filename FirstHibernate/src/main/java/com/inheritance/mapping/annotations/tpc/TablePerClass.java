package com.inheritance.mapping.annotations.tpc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;
import com.inheritance.mapping.tpc.ContractEmployee;
import com.inheritance.mapping.tpc.Employee;
import com.inheritance.mapping.tpc.RegularEmployee;

public class TablePerClass {
	public static void main(String[]args) {
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();
		
		com.inheritance.mapping.annotations.tpc.Employee employee = new com.inheritance.mapping.annotations.tpc.Employee();
		employee.setName("sohail");

		com.inheritance.mapping.annotations.tpc.RegularEmployee regularEmployee = new com.inheritance.mapping.annotations.tpc.RegularEmployee();
		regularEmployee.setName("suresh");
		regularEmployee.setSalary(45000);
		regularEmployee.setBonus(20000);

		com.inheritance.mapping.annotations.tpc.ContractEmployee contractEmployee = new com.inheritance.mapping.annotations.tpc.ContractEmployee();
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
