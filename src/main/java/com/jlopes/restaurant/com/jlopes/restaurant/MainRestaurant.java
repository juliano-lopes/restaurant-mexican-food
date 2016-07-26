package com.jlopes.restaurant;

import java.util.ArrayList;





public class MainRestaurant {

	public static void main(String[] args) {
		double valueOfTip;
		double valueOfCommission=0.05;
		Employee cashier1 = new Employee();
		Employee cashier2 = new Employee();
		
		
		Employee cook1 = new Employee();
		Employee cook2 = new Employee();
		Employee cook3 = new Employee();
		Employee cook4 = new Employee();

		Employee waiter1 = new Employee();
		Employee waiter2 = new Employee();
		Employee waiter3 = new Employee();
		Employee waiter4 = new Employee();
		Employee manager = new Employee();
		Restaurant restaurant = new Restaurant();
		restaurant.setCollectMoneyInMonth(50000);
		cashier1.setName("Manuel Nunes");
		cashier1.setProfession("Operador de Caixa");
		cashier1.setSalary(880.00);
		
		
		cashier2.setName("Francisco Nunes");
		cashier2.setProfession("Operador de Caixa");
		cashier2.setSalary(880.00);


		

		cook1.setName("Felipe de Oliveira");
		cook1.setProfession("Cozinheiro");
		cook1.setSalary(880.00);
		
		
		cook2.setName("Marcos de Oliveira");
		cook2.setProfession("Cozinheiro");
		cook2.setSalary(880.00);


		

		cook3.setName("Virgílio de Oliveira");
		cook3.setProfession("Cozinheiro");
		cook3.setSalary(880.00);
		cook4.setName("André de Oliveira");
		cook4.setProfession("Cozinheiro");
		cook4.setSalary(880.00);
		

		
		
		waiter1.setName("Leandro de Oliveira");
		waiter1.setProfession("Garçom");
		waiter1.setSalary(880.00);
		valueOfTip=2.50;
		waiter1.setAdditionToSalary(valueOfTip);
		valueOfTip=20.75;
		waiter1.setAdditionToSalary(valueOfTip);
		valueOfTip=12.30;
		waiter1.setAdditionToSalary(valueOfTip);
		valueOfTip=8.20;
		waiter1.setAdditionToSalary(valueOfTip);
		
		waiter1.calculateEmployeeSalary();
		waiter2.setName("Carlos de Oliveira");
		waiter2.setProfession("Garçom");
		waiter2.setSalary(880.00);
		valueOfTip=2.50;
		waiter2.setAdditionToSalary(valueOfTip);
		valueOfTip=20.75;
		waiter2.setAdditionToSalary(valueOfTip);
		valueOfTip=12.30;
		waiter2.setAdditionToSalary(valueOfTip);
		valueOfTip=8.20;
		waiter2.setAdditionToSalary(valueOfTip);
		
		waiter2.calculateEmployeeSalary();

		waiter3.setName("Gustavo de Oliveira");
		waiter3.setProfession("Garçom");
		waiter3.setSalary(880.00);
		valueOfTip=2.50;
		waiter3.setAdditionToSalary(valueOfTip);
		valueOfTip=20.75;
		waiter3.setAdditionToSalary(valueOfTip);
		valueOfTip=12.30;
		waiter3.setAdditionToSalary(valueOfTip);
		valueOfTip=8.20;
		waiter3.setAdditionToSalary(valueOfTip);
		
		waiter3.calculateEmployeeSalary();

		waiter4.setName("Romildo de Oliveira");
		waiter4.setProfession("Garçom");
		waiter4.setSalary(880.00);
		valueOfTip=2.50;
		waiter4.setAdditionToSalary(valueOfTip);
		valueOfTip=20.75;
		waiter4.setAdditionToSalary(valueOfTip);
		valueOfTip=12.30;
		waiter4.setAdditionToSalary(valueOfTip);
		valueOfTip=8.20;
		waiter4.setAdditionToSalary(valueOfTip);
		
		waiter4.calculateEmployeeSalary();

				
		manager.setName("Geonildo Gomes");
		manager.setProfession("Gerente");
		manager.setSalary(5000);
		manager.setAdditionToSalary(restaurant.getCollectMoneyInMonth()*valueOfCommission);
		manager.calculateEmployeeSalary();
		
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
