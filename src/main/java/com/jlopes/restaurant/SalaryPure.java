package com.jlopes.restaurant;

public class SalaryPure implements ISalary {
	double basicSalary;
	public SalaryPure(double basicSalary){
		this.basicSalary = basicSalary;
		
	}
	
	public double calculateSalary(){
		return basicSalary;
		
	}

}
