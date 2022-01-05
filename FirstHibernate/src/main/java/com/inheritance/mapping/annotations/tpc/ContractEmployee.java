package com.inheritance.mapping.annotations.tpc;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contractemp_tpc_annotations")
@AttributeOverrides({ @AttributeOverride(name = "ID", column = @Column(name = "ID")),
		@AttributeOverride(name = "name", column = @Column(name = "name")) })
public class ContractEmployee extends Employee{
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
