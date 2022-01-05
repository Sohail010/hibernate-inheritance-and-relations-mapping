package com.inheritance.mapping.annotations.tpsc;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "regemp_tpsc_annotations")
@PrimaryKeyJoinColumn(name = "ID")
public class RegularEmployee extends Employee {
	private float salary;
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
