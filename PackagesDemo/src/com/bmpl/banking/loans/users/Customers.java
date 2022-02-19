package com.bmpl.banking.loans.users;

import com.bmpl.banking.insurance.LifeInsurance;

public class Customers {
	// can be accessed outside this package using inheritance
	protected int id;
	protected String name;
	// can be accessed only within same package
	String email;
	double salary;
	
	public static void main(String[] args) {
		LifeInsurance obj = new LifeInsurance();
		obj.printInsuranceDetails();
//		obj.x
	}
}
