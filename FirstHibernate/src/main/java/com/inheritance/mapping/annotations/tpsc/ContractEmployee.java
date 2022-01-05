package com.inheritance.mapping.annotations.tpsc;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "contractemp_tpsc_annotations")
@PrimaryKeyJoinColumn(name = "ID")
public class ContractEmployee extends Employee {

	private float payPerHour;
	private String contractPeriod;

	public float getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}

}
