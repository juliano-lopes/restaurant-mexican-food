package mainrestaurant;


import java.util.ArrayList;

import employees.Employee;



public class Restaurant {
private final double collectedMoneyInMonth;
private double spendWithEmployees;

public Restaurant(double collectedMoneyInMonth){
	this.collectedMoneyInMonth = collectedMoneyInMonth;
	
	
}
public double getCollectedMoneyInMonth() {
	return collectedMoneyInMonth;
}
public void calculateSpendWithEmployees(ArrayList<Employee> listEmployees){
double calculationOfSalaries=0;
for(int arrow=0;arrow<listEmployees.size();arrow++){
	Employee employee = listEmployees.get(arrow);
	calculationOfSalaries += employee.getSalary();
	
}
this.spendWithEmployees = calculationOfSalaries;
}

public void showDataOfRestaurant(){
	System.out.println("Neste mês o restaurante arrecadou "+this.collectedMoneyInMonth+" reais.");
	System.out.println("Para pagar todos os funcionários são necessários "+this.spendWithEmployees+" reais.");
	
	

}

}
	