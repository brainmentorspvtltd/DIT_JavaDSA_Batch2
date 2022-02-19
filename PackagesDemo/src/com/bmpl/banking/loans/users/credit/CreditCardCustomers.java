package com.bmpl.banking.loans.users.credit;

import com.bmpl.banking.loans.users.Customers;

public class CreditCardCustomers extends Customers {
	void show() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
//		System.out.println("Email : " + email);
//		System.out.println("Salary : " + salary);
	}
}

//public class CreditCardCustomers{
//	void show() {
//		Customers obj = new Customers();
//		System.out.println("Id : " + obj.id);
//		System.out.println("Name : " + obj.name);
//		System.out.println("Email : " + obj.email);
//		System.out.println("Salary : " + obj.salary);
//	}
//}