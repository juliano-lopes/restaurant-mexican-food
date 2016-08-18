package com.jlopes.restaurant;
import java.util.ArrayList;


import com.jlopes.restaurant.employees.Employee;

public class MainRestaurant {
	


	public static void main(String[] args) {
		 
			
		RestaurantService restaurantService = new RestaurantService();
		EmployeeService employeeService = new EmployeeService(restaurantService);
			
			ArrayList<Employee> employees = (ArrayList<Employee>) employeeService.getAll();
			
			
PrinterData printer = new PrinterData();
			printer.showEmployeesData(employees);
			
			System.out.println("O restaurante precisa de "+restaurantService.calculateSpendWithEmployees(employees)+" reais para pagar todos os funcionários.");
			

			
			
		
			
			

		}

	
}
