package com.jlopes.restaurant.employees;

public class Waiter extends Employee {
public Waiter(String name, double basicSalary){
	super(name,"Garçom",basicSalary);
	
	
}
public void additionToSalary(double tip){
	this.salary+=tip;
	
}
}
