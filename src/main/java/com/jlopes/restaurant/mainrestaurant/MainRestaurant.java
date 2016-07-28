package mainrestaurant;

import java.util.ArrayList;

import employees.Cashier;
import employees.Cook;
import employees.Employee;
import employees.Manager;
import employees.Waiter;





public class MainRestaurant {

	public static void main(String[] args) {
		Cashier cashier1 = new Cashier("Manuel Nunes",880.00);
		Cashier cashier2 = new Cashier("Francisco Nunes",880.00);
		Cook cook1 = new Cook("Felipe de Oliveira",880.00);
		Cook cook2 = new Cook("Marcos Oliveira",880.00);
		Cook cook3 = new Cook("Virgílio de Oliveira",880.00);
		Cook cook4 = new Cook("André Oliveira",880.00);
		
		Waiter  waiter1 = new Waiter("Leandro Alves",880.00);
		Waiter  waiter2 = new Waiter("Gustavo Alves",880.00);
		Waiter  waiter3 = new Waiter("Algusto Alves",880.00);
		Waiter  waiter4 = new Waiter("Marcelo Alves",880.00);

		Manager manager = new Manager("Gilberto Mendes",5000.00);		
		Restaurant restaurant = new Restaurant(100000.00);
		waiter1.additionToSalary(10.00);	
		waiter2.additionToSalary(20.00);
		waiter3.additionToSalary(30.00);
		waiter4.additionToSalary(40.00);
		manager.additionToSalary(restaurant.getCollectedMoneyInMonth());
		ArrayList<Employee> listEmployee = new ArrayList<Employee>();
		
		listEmployee.add(cashier1);
		listEmployee.add(cashier2);
		listEmployee.add(cook1);
		listEmployee.add(cook2);
		listEmployee.add(cook3);
		listEmployee.add(cook4);
		listEmployee.add(waiter1);
		listEmployee.add(waiter2);
		listEmployee.add(waiter3);
		listEmployee.add(waiter4);
		listEmployee.add(manager);


		restaurant.calculateSpendWithEmployees(listEmployee);
		
		for(int arrow=0;arrow<listEmployee.size();arrow++){
			Employee employee = listEmployee.get(arrow);
			employee.showDataOfEmployee();
			
			
		}
		restaurant.showDataOfRestaurant();
		
	}
	
}
	
	