package com.service.dao;

import org.springframework.stereotype.Repository;

import com.service.model.AnnualPaymentRate;
import com.service.model.LeastMonthlyPayment;
import com.service.model.LoanMonthlyPayment;
import com.service.model.LoanNumberPayment;

@Repository
public class FormulaImplementation implements FormulaMethod {

	public double annualPaymentRate1(AnnualPaymentRate apr) {
		// TODO Auto-generated method stub
		double rate = apr.getInterestRate() / 1200;
		double value = Math.pow((1 + rate), apr.getMonths());
		double apr1 = ((apr.getLoanAmount() + apr.getExtraCost()) * rate * value) / (value - 1);

		return apr1;
	}

	public double leastMonthlyPayment(LeastMonthlyPayment lmp) {
		double rate = lmp.getInterestRate() / 1200;
		double value = Math.pow((1 + rate), lmp.getMonths());
		double leastmp = ((lmp.getLoanAmount() * rate * value) - (lmp.getResidualValue() * rate)) / (value - 1);
		return leastmp;
	};

	public double loanMonthlyPayment(LoanMonthlyPayment loanmp) {
		// TODO Auto-generated method stub
		double rate = loanmp.getInterestRate() / 1200;
		double value = Math.pow((1 + rate), loanmp.getMonths());
		double result = (loanmp.getLoanAmount() * rate * value) / (value - 1);
		return result;
	};

	public double loanNumberPayment(LoanNumberPayment loanNp) {
		// TODO Auto-generated method stub
		double rate = loanNp.getInterestRate() / 1200;
		double lNP = (Math.log(loanNp.getMonthlyPayment() / loanNp.getLoanAmount()) - Math.log((loanNp.getMonthlyPayment() / loanNp.getLoanAmount()) - rate))
				/ Math.log(1 + rate);
		return lNP;
	};

}
