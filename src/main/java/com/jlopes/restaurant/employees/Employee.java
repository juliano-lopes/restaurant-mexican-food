package com.jlopes.restaurant.employees;

import com.jlopes.restaurant.ISalary;


public class Employee {
	protected final String name;
	protected final String profession;
	ISalary salary;
	

public String getName(){
	return name;
	
}
public String getProfession(){
	return profession;
	
}

public Employee(String name, String profession, ISalary salary){
		this.name = name;
		this.profession = profession;
		
		this.salary = salary;


			
		}

public double calculateSalary(){
	return salary.calculateSalary();
	
}
	
	



	

	}
