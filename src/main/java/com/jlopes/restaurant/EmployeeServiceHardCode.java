package com.jlopes.restaurant;

import java.util.ArrayList;
import java.util.List;

import com.jlopes.restaurant.employees.Cashier;
import com.jlopes.restaurant.employees.Cook;
import com.jlopes.restaurant.employees.Employee;
import com.jlopes.restaurant.employees.Manager;
import com.jlopes.restaurant.employees.Waiter;

public class EmployeeServiceHardCode implements IEmployeeService {
	RestaurantService restaurantService;
	public EmployeeServiceHardCode(RestaurantService restaurantService){
		this.restaurantService = restaurantService;
		
		
	}
public List<Employee> getAll(){
	List<Employee> employees = new ArrayList<Employee>();
	
	Cashier cashier1 = new Cashier("Manuel Nunes", new SalaryPure(880.00));
	Cashier cashier2 = new Cashier("Francisco Nunes", new SalaryPure(880.00));

	Cook cook1 = new Cook("Felipe de Oliveira", new SalaryPure(880.00));
	Cook cook2 = new Cook("Marcos Oliveira", new SalaryPure(880.00));
	Cook cook3 = new Cook("Virgílio de Oliveira", new SalaryPure(880.00));
	Cook cook4 = new Cook("André Oliveira", new SalaryPure(880.00));
	
	Waiter  waiter1 = new Waiter("Leandro Alves", new SalaryWaiter(880.00));
	Waiter  waiter2 = new Waiter("Gustavo Alves", new SalaryWaiter(880.00));
	Waiter waiter3 = new Waiter("Algusto Alves", new SalaryWaiter(880.00));
	Waiter  waiter4 = new Waiter("Marcelo Alves", new SalaryWaiter(880.00));

	Manager manager = new Manager("Gilberto Mendes", new SalaryManager(5000.00,restaurantService.collectedMoneyInMonth()));		

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
