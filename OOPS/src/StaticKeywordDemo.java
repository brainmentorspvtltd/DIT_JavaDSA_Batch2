class Customer {
//	static int id;		// class variables - loaded with class
	
	static int counter;
	int id;
	String name;		// instance variable - loaded with object
	double balance;
	
//	static block
	static {
		counter = 100;
		System.out.println("Static block Init...");
	}
	
	public Customer(String name, double balance) {
		counter++;
		this.id = counter;
		this.name = name;
		this.balance = balance;
		System.out.println("Object Created...");
	}
	
}

public class StaticKeywordDemo {

	public static void main(String[] args) {
		
		Customer ram = new Customer("Ram", 45000.00);
		System.out.println(ram.id + ", " + ram.name + ", " + ram.balance);
		
		Customer shyam = new Customer("Shyam", 55000.00);
		System.out.println(shyam.id + ", " + shyam.name + ", " + shyam.balance);
		
		System.out.println("Id of Ram is : " + ram.id);

	}

}
