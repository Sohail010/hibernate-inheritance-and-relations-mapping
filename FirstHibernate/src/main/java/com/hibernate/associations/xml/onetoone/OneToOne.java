package com.hibernate.associations.xml.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;

public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();
		Employee employee = new Employee();
		employee.setName("Ravi");
		employee.setEmail("ravi45@gmail.com");

		Address address1 = new Address();
		address1.setAddressLine1("Gandhi Nagar");
		address1.setCity("Hyderabad");
		address1.setState("TN");
		address1.setCountry("India");
		address1.setPinCode(500001);

		employee.setAddress(address1);
		address1.setEmployee(employee);

		session.persist(employee);
		transaction.commit();

		session.close();
	}

}
