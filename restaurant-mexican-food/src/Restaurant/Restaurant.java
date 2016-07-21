package Restaurant;


import java.util.ArrayList;

import employee.Employee;

public class Restaurant {
private double collectMoneyInMonth;
private double spendWithEmployees;
private int quantityOfEmployees;
private ArrayList<Employee> employees;
public double getCollectMoneyInMonth() {
	return collectMoneyInMonth;
}
public void setCollectMoneyInMonth(double collectMoneyInMonth) {
	this.collectMoneyInMonth = collectMoneyInMonth;
}
public double getSpendWithEmployees() {
	return spendWithEmployees;
}
public void setSpendWithEmployees(double spendWithEmployees) {
	this.spendWithEmployees = spendWithEmployees;
}

public int getQuantityOfEmployees() {
	return quantityOfEmployees;
}
public void setQuantityOfEmployees(int quantityOfEmployees) {
	this.quantityOfEmployees = quantityOfEmployees;
}
public ArrayList<Employee> getEmployees() {
	return employees;
}
public void setEmployees(ArrayList<Employee> employee) {
	this.employees = employee;
}
public void obtainQuantityOfEmployees(){
	this.quantityOfEmployees = this.employees.size();
	
	
}
public void calculateSpendWithEmployees(){
double calculationOfSalaries=0;
for(int arrow=0;arrow<this.quantityOfEmployees;arrow++){
	Employee employee = this.employees.get(arrow);
	calculationOfSalaries += employee.getSalary();
	this.spendWithEmployees = calculationOfSalaries;
	
	
}

	
	
	
}
}
