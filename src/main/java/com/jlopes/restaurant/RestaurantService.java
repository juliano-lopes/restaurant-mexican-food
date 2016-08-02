package com.jlopes.restaurant;







import java.util.ArrayList;

import com.jlopes.restaurant.employees.Employee;

public class RestaurantService {
	public double collectedMoneyInMonth(){
		return 50000;
		
	}
	public double calculateSpendWithEmployees(ArrayList<Employee> employees){
		
		double calculation=0;
		for(Employee employee : employees){
			calculation+=employee.getFullSalary();
			
			
		}
		
		return calculation;
		
		}

}
