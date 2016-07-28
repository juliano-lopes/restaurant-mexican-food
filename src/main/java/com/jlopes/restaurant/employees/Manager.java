package com.jlopes.restaurant.employees;

public class Manager extends Employee {
	
	public Manager(String name, double basicSalary){
		super(name,"Gerente",basicSalary);
		
		
	}
	
	public void additionToSalary(double collectedMoneyInMonth){
		this.salary += collectedMoneyInMonth * 0.05;
		
		
	}
	

}
