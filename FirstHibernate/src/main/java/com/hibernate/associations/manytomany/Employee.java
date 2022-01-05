package com.hibernate.associations.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_m-n_annotations")
public class Employee {

	@Id
	private int employeeID;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "Project_id")
	@ManyToMany
	private List<Projects> project;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Projects> getProject() {
		return project;
	}

	public void setProject(List<Projects> project) {
		this.project = project;
	}
}
