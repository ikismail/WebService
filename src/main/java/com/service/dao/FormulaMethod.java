package com.service.dao;

import com.service.model.AnnualPaymentRate;
import com.service.model.LeastMonthlyPayment;
import com.service.model.LoanMonthlyPayment;
import com.service.model.LoanNumberPayment;

public interface FormulaMethod {

	double annualPaymentRate(AnnualPaymentRate apr);

	double leastMonthlyPayment(LeastMonthlyPayment lmp);

	double loanMonthlyPayment(LoanMonthlyPayment loanmp);

	double loanNumberPayment(LoanNumberPayment loanNp);

}
