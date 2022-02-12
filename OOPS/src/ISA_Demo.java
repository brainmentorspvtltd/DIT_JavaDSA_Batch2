import java.util.Date;

/*
 * Code Reusability
 * Polymorphism
 */

class Account {
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

class SavingAccount extends Account {
	double minBalance;
	void computeROI() {
		System.out.println("SA ROI is 6%");
	}
	
	@Override
	void withdraw() {
		System.out.println("Withdraw limit is 50K");
	}
}

class CurrentAccount extends Account {
	double odLimit;	// over draft limit
	void computeOD() {
		System.out.println("OD Limit is 1Lakh");
	}
	
	void deposit() {
		System.out.println("Deposit Limit for CA is 1Lakh");
	}
}

public class ISA_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.openAccount();
		sa.withdraw();     // calling child class withdraw
		sa.deposit();
		sa.computeROI();
		
		System.out.println("**********************");
		
		CurrentAccount ca = new CurrentAccount();
		ca.openAccount();
		ca.withdraw();	  // calling parent class withdraw
		ca.deposit();	  // calling child class deposit
		ca.computeOD();
		
	}

}
