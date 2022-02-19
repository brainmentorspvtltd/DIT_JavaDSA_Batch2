package com.bmpl.banking.loans.users;

//public class PrimeCustomers extends Customers {
//	void show() {
//		System.out.println("Id : " + id);
//		System.out.println("Name : " + name);
//		System.out.println("Email : " + email);
//		System.out.println("Salary : " + salary);
//	}
//}

public class PrimeCustomers {
	void show() {
		Customers c = new Customers();
		System.out.println("Id : " + c.id);
		System.out.println("Name : " + c.name);
		System.out.println("Email : " + c.email);
		System.out.println("Salary : " + c.salary);
	}
}