package com.jlopes.restaurant;

import java.util.List;

import com.jlopes.restaurant.employees.Employee;

public class PrinterData {
public void showEmployeesData(List<Employee> employees){
	for(Employee employee : employees){
		System.out.println("Nome: "+employee.getName());
		System.out.println("Profissão: "+employee.getProfession());
		System.out.println("Salário: "+employee.getFullSalary());
		
		
	}
	
	
	
}
}
