package com.jlopes.restaurant;

public class SalaryManager implements ISalary {
	double basicSalary;
	double collectedMoneyInMonth;
	
	public SalaryManager(double basicSalary, double collectedMoneyInMonth){
		this.basicSalary = basicSalary;
		this.collectedMoneyInMonth = collectedMoneyInMonth;
	}
	
public double calculateSalary(){
	return basicSalary + (collectedMoneyInMonth * 0.05);
	
}
}

