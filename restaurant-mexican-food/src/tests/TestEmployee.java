package tests;
/*
import java.util.ArrayList;

import Restaurant.Restaurant;
import employee.Employee;

public class TestEmployee {
	
	public static void main(String[] args) {
		double valueOfTip;
		double valueOfCommission=0.05;
		
		Employee waiter = new Employee();
		Employee manager = new Employee();
		Restaurant restaurant = new Restaurant();
		restaurant.setCollectMoneyInMonth(50000);
		waiter.setName("Marcos de Oliveira");
		waiter.setProfession("waiter");
		waiter.setSalary(880.00);
		valueOfTip=2.50;
		waiter.setAdditionToSalary(valueOfTip);
		valueOfTip=20.75;
		waiter.setAdditionToSalary(valueOfTip);
		valueOfTip=12.30;
		waiter.setAdditionToSalary(valueOfTip);
		valueOfTip=8.20;
		waiter.setAdditionToSalary(valueOfTip);
		
		waiter.calculateEmployeeSalary();

		
		manager.setName("Juliano Lopes");
		manager.setProfession("Manager Projects");
		manager.setSalary(5000);
		manager.setAdditionToSalary(restaurant.getCollectMoneyInMonth()*valueOfCommission);
		manager.calculateEmployeeSalary();
		
		ArrayList<Employee> listEmployee = new ArrayList<>();
		
		listEmployee.add(waiter);
		listEmployee.add(manager);
		
		restaurant.setEmployees(listEmployee);
		restaurant.obtainQuantityOfEmployees();
		restaurant.calculateSpendWithEmployees();
		
		System.out.println("Neste mês, o restaurante obteve uma receita de "+restaurant.getCollectMoneyInMonth()+" reais.");
		System.out.println("Atualmente o restaurante possui "+restaurant.getQuantityOfEmployees()+" funcionários.");
		for(int arrow=0;arrow<restaurant.getQuantityOfEmployees();arrow++){
			Employee employee = listEmployee.get(arrow);
			employee.showEmployeeData();
			
			
			
		}
		
		
		System.out.println("São necessários "+restaurant.getSpendWithEmployees()+" reais para pagar todos os funcionários.");
		
		
	
		
		

	}

}
*/