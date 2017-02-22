package com.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.dao.FormulaMethod;
import com.service.model.AnnualPaymentRate;
import com.service.model.LeastMonthlyPayment;
import com.service.model.LoanMonthlyPayment;
import com.service.model.LoanNumberPayment;

@RestController
public class serviceController {

	@Autowired
	private FormulaMethod formulaMethod;

	@RequestMapping(value = "/APR/", method = RequestMethod.POST)
	public ResponseEntity<?> calculateAPR(@RequestBody AnnualPaymentRate apr) {
		System.out.println("Starting APR Calculations");
		double value = formulaMethod.annualPaymentRate1(apr);
		apr.setValue(value);
		return new ResponseEntity<AnnualPaymentRate>(apr, HttpStatus.OK);

	}

	@RequestMapping(value = "/LeastMonthlyPayment/", method = RequestMethod.POST)
	public ResponseEntity<?> calculateLeast(@RequestBody LeastMonthlyPayment lmp) {
		System.out.println("Starting LeastMP Calculations");
		double value = formulaMethod.leastMonthlyPayment(lmp);
		lmp.setValue(value);
		return new ResponseEntity<LeastMonthlyPayment>(lmp, HttpStatus.OK);

	}

	@RequestMapping(value = "/LoanMonthlyPayment/", method = RequestMethod.POST)
	public ResponseEntity<?> calculateLoanMP(@RequestBody LoanMonthlyPayment lmp) {
		System.out.println("Starting LoanMP Calculations");
		double value = formulaMethod.loanMonthlyPayment(lmp);
		lmp.setValue(value);
		return new ResponseEntity<LoanMonthlyPayment>(lmp, HttpStatus.OK);

	}
	
	@RequestMapping(value = "/LoanNumberPayment/", method = RequestMethod.POST)
	public ResponseEntity<?> calculateLoanNP(@RequestBody LoanNumberPayment lnp) {
		System.out.println("Starting LoanNP Calculations");
		double value = formulaMethod.loanNumberPayment(lnp);
		lnp.setValue(value);
		return new ResponseEntity<LoanNumberPayment>(lnp, HttpStatus.OK);

	}
}
