abstract class Loan {
	void applyForLoan() {
		System.out.println("Apply for loan...");
	}
	abstract void emi();
	abstract void roi();
}

class HomeLoan extends Loan {
	
	@Override
	void applyForLoan() {
		System.out.println("Apply for Home Loan...");
	}

	@Override
	void emi() {
		System.out.println("Homeloan EMI...");
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		System.out.println("Homeloan ROI...");
	}
	
}

class VehicleLoan extends Loan {

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}
	
}

class EducationLoan extends Loan {

	@Override
	void emi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Loan loan = new Loan();
		HomeLoan loan = new HomeLoan();

	}

}
