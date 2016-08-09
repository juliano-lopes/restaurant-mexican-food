package com.jlopes.restaurant.employees;

import com.jlopes.restaurant.RestaurantService;

public class Manager extends Employee {
	
	RestaurantService restaurantService;
	
	public Manager(String name, double basicSalary, RestaurantService restaurantService){
		super(name,"Gerente",basicSalary);
		this.restaurantService = restaurantService;
		
		
		
	}
	
	
	public double calculateSalary(){
		
		
		return  this.basicSalary + (this.restaurantService.collectedMoneyInMonth() * 0.05);
		
		
	}
	
	

}
