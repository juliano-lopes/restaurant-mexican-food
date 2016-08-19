package com.jlopes.restaurant;

import java.util.Random;

public class SalaryWaiter implements ISalary {
	double basicSalary;
public SalaryWaiter(double basicSalary){
	this.basicSalary = basicSalary;
	
}

public double calculateSalary(){
	return basicSalary + additionalTip();
	
	
	
}

private int additionalTip(){
	Random tip = new Random();
	return tip.nextInt(100);
	
}

}
