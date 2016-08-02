package com.jlopes.restaurant.employees;

import com.jlopes.restaurant.RestaurantService;

public class Manager extends Employee {
	
	public Manager(String name, double basicSalary){
		super(name,"Gerente",basicSalary);
		
		
	}
	
	
	public void calculateSalary(){
		RestaurantService restaurant = new RestaurantService();
		
		this.fullSalary = this.basicSalary + (restaurant.collectedMoneyInMonth() * 0.05);
		
		
	}
	

}
