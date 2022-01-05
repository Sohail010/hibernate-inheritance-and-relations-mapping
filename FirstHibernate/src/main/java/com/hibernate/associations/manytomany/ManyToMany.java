package com.hibernate.associations.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.util.RegisterHibernate;

public class ManyToMany {
	public static void main(String[] args) {
		RegisterHibernate.register();
		Session session = RegisterHibernate.getSession();
		Transaction transaction = RegisterHibernate.getTransaction();

		Employee employee = new Employee();
		employee.setEmployeeID(1007);
		employee.setEmployeeName("sohail");

		Employee employee2 = new Employee();
		employee2.setEmployeeID(1009);
		employee2.setEmployeeName("Abhinay");

		Employee employee3 = new Employee();
		employee3.setEmployeeID(1011);
		employee3.setEmployeeName("phani");

		Projects projects = new Projects();
		projects.setProjectID(101);
		projects.setProjectName("Banking");

		Projects projects2 = new Projects();
		projects2.setProjectID(102);
		projects2.setProjectName("Library Management System");

		Projects projects3 = new Projects();
		projects3.setProjectID(105);
		projects3.setProjectName("Prediction system");

		List<Projects> listOFProjects = new ArrayList<Projects>();
		listOFProjects.add(projects);

		listOFProjects.add(projects2);
		List<Projects> listOFProjects1 = new ArrayList<Projects>();
		listOFProjects1.add(projects3);

		employee.setProject(listOFProjects);
		employee2.setProject(listOFProjects1);
		
		session.persist(employee);
		session.persist(employee2);
		session.persist(employee3);
		session.persist(projects);
		session.persist(projects2);
		session.persist(projects3);
		
		transaction.commit();
		session.close();

	}
}
