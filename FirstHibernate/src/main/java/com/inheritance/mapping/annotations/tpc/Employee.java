package com.inheritance.mapping.annotations.tpc;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name = "emp_tpc_annotations")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
