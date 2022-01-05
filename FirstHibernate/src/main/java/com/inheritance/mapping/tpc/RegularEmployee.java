package com.inheritance.mapping.tpc;

public class RegularEmployee extends Employee {
	private float salary;
	private int bonus;

	public float getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
