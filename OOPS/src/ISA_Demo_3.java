import java.util.Date;

/*
 * Code Reusability
 * Polymorphism
 */

class Account_3 {
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

class SavingAccount_3 extends Account_3 {
	double minBalance;
	void computeROI() {
		System.out.println("SA ROI is 6%");
	}
	
	@Override
	void withdraw() {
		System.out.println("Withdraw limit is 50K");
	}
}

class CurrentAccount_3 extends Account_3 {
	double odLimit;	// over draft limit
	void computeOD() {
		System.out.println("OD Limit is 1Lakh");
	}
	
	void deposit() {
		System.out.println("Deposit Limit for CA is 1Lakh");
	}
}


public class ISA_Demo_3 {
	
	void caller(Account_3 account) {
		account.openAccount();
		account.withdraw();
		account.deposit();
		
		if(account instanceof SavingAccount_3) {
			SavingAccount_3 sa = (SavingAccount_3) account;		// Downcasting 
			sa.computeROI();
//			System.out.println(sa);
		}
		else if(account instanceof CurrentAccount_3) {
			CurrentAccount_3 ca = (CurrentAccount_3) account;
			ca.computeOD();
//			System.out.println(ca);
		}
	}

	public static void main(String[] args) {
		ISA_Demo_3 obj = new ISA_Demo_3();
		Account_3 acc = new SavingAccount_3();		// Upcasting
		System.out.println("Saving Account...");
		System.out.println(acc);
		obj.caller(acc);
		
		System.out.println("**********************");
		
		System.out.println("Current Account...");
		acc = new CurrentAccount_3();
		obj.caller(acc);
		
//		ISA_Demo_3 obj_1 = new ISA_Demo_3();
//		System.out.println(obj_1);
//		ISA_Demo_3 obj_2 = new ISA_Demo_3();
//		System.out.println(obj_2);
//		ISA_Demo_3 obj_3 = new ISA_Demo_3();
//		System.out.println(obj_3);
		
	}

}
