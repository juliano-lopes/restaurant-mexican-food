package com.jlopes.restaurant.employees;

import java.util.Random;



public class Waiter extends Employee {
	
	
public Waiter(String name, double basicSalary){
	super(name,"Garçom",basicSalary);

	
	
}
public double calculateSalary(){

return  this.basicSalary + this.additionalTip();
	
}
private int additionalTip(){
	Random tip = new Random();
	return tip.nextInt(100);
	
}


}
