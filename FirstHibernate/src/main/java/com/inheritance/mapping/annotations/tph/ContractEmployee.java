package com.inheritance.mapping.annotations.tph;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ContractEmployee")
public class ContractEmployee extends Employee {
	private double payPerHour;
	private String contractPeriod;

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
}
