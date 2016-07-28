package com.jlopes.restaurant.employees;


public class Employee {
	protected final String name;
	protected final String profession;
	protected double salary;

	public Employee(String name, String profession, double salary){
		this.name = name;
		this.profession = profession;
		this.salary = salary;


			
		}


	public double getSalary(){
		return  salary;
		
		
	}
	public void showDataOfEmployee(){
		System.out.println("Nome: "+this.name);
		System.out.println("Profissão: "+this.profession);
		System.out.println("Salário: "+this.getSalary());
		
		

	}

	}
