package com.service.model;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
@Component
public class LeastMonthlyPayment {

	private double loanAmount;
	private double residualValue;
	private double interestRate;
	private double months;
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getResidualValue() {
		return residualValue;
	}

	public void setResidualValue(double residualValue) {
		this.residualValue = residualValue;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getMonths() {
		return months;
	}

	public void setMonths(double months) {
		this.months = months;
	}

}
