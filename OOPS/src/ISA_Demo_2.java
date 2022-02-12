import java.util.Date;

/*
 * Code Reusability
 * Polymorphism
 */

class Account_2 {
	int accountNo;
	double balance;
	String accHolderName;
	Date opening;
	boolean status;
	void openAccount() {
		Date date = new Date();
		System.out.println("Open Account : " + date);
	}
	
	void deposit() {
		System.out.println("Deposit Function of Account Class");
	}
	
	void withdraw() {
		System.out.println("Withdraw function of Account Class...Withdraw limit is 25K");
	}
}

class SavingAccount_2 extends Account_2 {
	double minBalance;
	void computeROI() {
		System.out.println("SA ROI is 6%");
	}
	
	@Override
	void withdraw() {
		System.out.println("Withdraw limit is 50K");
	}
}

class CurrentAccount_2 extends Account_2 {
	double odLimit;	// over draft limit
	void computeOD() {
		System.out.println("OD Limit is 1Lakh");
	}
	
	void deposit() {
		System.out.println("Deposit Limit for CA is 1Lakh");
	}
}


public class ISA_Demo_2 {

	public static void main(String[] args) {
		// Saving account is larger, because it has it's own features + parent's features
		// now only those functions are accessible which are common in both classes
		Account acc = new SavingAccount();
		acc.openAccount();
		acc.withdraw();     // calling child class withdraw
		acc.deposit();
//		acc.computeROI();
		
		System.out.println("**********************");
		
		acc = new CurrentAccount();
		acc.openAccount();
		acc.withdraw();	  // calling parent class withdraw
		acc.deposit();	  // calling child class deposit
//		acc.computeOD();
	}

}
