package com.jlopes.restaurant;


public class Employee {
private String name;
private String profession;
private double salary;
private double additionToSalary;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProfession() {
	return profession;
}
public void setProfession(String profession) {
	this.profession = profession;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public double getAdditionToSalary() {
	return additionToSalary;
}
public void setAdditionToSalary(double additionToSalary) {
	this.additionToSalary += additionToSalary;
}
public Employee(){
	this.additionToSalary=0;
	
}
public void calculateEmployeeSalary(){
	this.salary+=this.additionToSalary;
	
	
	
}
public void showEmployeeData() {
	
	System.out.println("Nome: "+this.name);
	System.out.println("Profissão: "+this.profession);
	System.out.println("Salário: "+this.salary);
	
	
	

}
}
