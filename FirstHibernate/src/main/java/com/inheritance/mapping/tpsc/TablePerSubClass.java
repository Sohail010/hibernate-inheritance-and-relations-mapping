package com.inheritance.mapping.tpsc;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;

public class TablePerSubClass {
	public static void main(String[] args) {
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();
		Employee employee = new Employee();
		employee.setName("kamal");
		RegularEmployee regularEmployee = new RegularEmployee();
		regularEmployee.setName("Hruthik");
		regularEmployee.setSalary(50000);
		regularEmployee.setBonus(15000);
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("krishna");
		contractEmployee.setPayPerHour(45);
		contractEmployee.setContractPeriod("6 months");

		session.persist(contractEmployee);
		session.persist(regularEmployee);
		session.persist(employee);
		transaction.commit();
		session.close();
	}

}
