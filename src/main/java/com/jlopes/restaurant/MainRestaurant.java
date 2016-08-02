package com.jlopes.restaurant;
import java.util.ArrayList;


import com.jlopes.restaurant.employees.Employee;

public class MainRestaurant {
	


	public static void main(String[] args) {
		 
			
			EmployeeService employeeService = new EmployeeService();
			RestaurantService restaurantService = new RestaurantService();
			ArrayList<Employee> employees = (ArrayList<Employee>) employeeService.getAll();
			employees = (ArrayList<Employee>) employeeService.calculationOfAllTheSalaries(employees);
			
PrinterData printer = new PrinterData();
			printer.showEmployeesData(employees);
			
			System.out.println("O restaurante precisa de "+restaurantService.calculateSpendWithEmployees(employees)+" reais para pagar todos os funcionários.");
			

			
			
		
			
			

		}

	
}
