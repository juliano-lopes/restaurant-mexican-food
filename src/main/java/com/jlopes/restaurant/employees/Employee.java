package com.jlopes.restaurant.employees;


public class Employee {
	protected final String name;
	protected final String profession;
	protected double basicSalary;

public String getName(){
	return name;
	
}
public String getProfession(){
	return profession;
	
}

public Employee(String name, String profession, double basicSalary){
		this.name = name;
		this.profession = profession;
		this.basicSalary = basicSalary;


			
		}

public double calculateSalary(){
	return this.basicSalary;
	
}
	
	



	

	}
