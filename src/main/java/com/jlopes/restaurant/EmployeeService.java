package com.jlopes.restaurant;

import java.util.ArrayList;
import java.util.List;

import com.jlopes.restaurant.employees.Cashier;
import com.jlopes.restaurant.employees.Cook;
import com.jlopes.restaurant.employees.Employee;
import com.jlopes.restaurant.employees.Manager;
import com.jlopes.restaurant.employees.Waiter;

public class EmployeeService {
	RestaurantService restaurantService;
	public EmployeeService(RestaurantService restaurantService){
		this.restaurantService = restaurantService;
		
		
	}
public List<Employee> getAll(){
	List<Employee> employees = new ArrayList<Employee>();
	
	Cashier cashier1 = new Cashier("Manuel Nunes",880.00);
	Cashier cashier2 = new Cashier("Francisco Nunes",880.00);

	Cook cook1 = new Cook("Felipe de Oliveira",880.00);
	Cook cook2 = new Cook("Marcos Oliveira",880.00);
	Cook cook3 = new Cook("Virgílio de Oliveira",880.00);
	Cook cook4 = new Cook("André Oliveira",880.00);
	
	Waiter  waiter1 = new Waiter("Leandro Alves",880.00);
	Waiter  waiter2 = new Waiter("Gustavo Alves",880.00);
	Waiter waiter3 = new Waiter("Algusto Alves",880.00);
	Waiter  waiter4 = new Waiter("Marcelo Alves",880.00);

	Manager manager = new Manager("Gilberto Mendes",5000.00,restaurantService.collectedMoneyInMonth());		

	employees.add(cashier1);
	employees.add(cashier2);
	employees.add(cook1);
	employees.add(cook2);
	employees.add(cook3);
	employees.add(cook4);
	employees.add(waiter1);
	employees.add(waiter2);
	employees.add(waiter3);
	employees.add(waiter4);
	employees.add(manager);

	return employees;
	
	
}


}
