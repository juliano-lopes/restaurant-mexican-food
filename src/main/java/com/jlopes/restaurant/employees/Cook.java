package com.jlopes.restaurant.employees;



public class Cook extends Employee {
public Cook(String name, double basicSalary){
	super(name,"Cozinheiro",basicSalary);
	
	
}

public double calculateSalary(){
	
	
	return this.basicSalary;
	
	
}


}
