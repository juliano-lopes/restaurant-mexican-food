package com.jlopes.restaurant.employees;



public class Manager extends Employee {
	
private double collectedMoneyInMonth;

	
	public Manager(String name, double basicSalary, double collectedMoneyInMonth){
		super(name,"Gerente",basicSalary);
		this.collectedMoneyInMonth = collectedMoneyInMonth;
		
		
		
		
	}
	
	
	public double calculateSalary(){
		
		
		return  this.basicSalary + (this.collectedMoneyInMonth * 0.05);
		
		
	}
	
	

}
