//Encapsulation - wrapping of variables and methods in a single unit (class)
//Data Hiding - make variables private
//Good Encapsulation = Data Hiding + Encapsulation

public class StudentReport {
	
	private int rollno;
	private String name;
	private String course;
	private String address;
	private double fees;
	private String collegeName;
	
	// Default Constructor
	public StudentReport() {
		this.collegeName = "DIT";
	}
	
//	to initialize variables we use constructor
	public StudentReport(int rollno, String name, String course, String address, double fees) {
		this(); // it will call default constructor...
		System.out.println("Object created...");
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.address = address;
		this.fees = fees;
	}
	
//	public void takeInput(int rollno, String name, String course, String address, double fees) {
//		if(rollno > 0 && fees > 0) {
//			this.rollno = rollno;
//			this.name = name;
//			this.course = course;
//			this.address = address;
//			this.fees = fees;
//		}
//		else {
//			System.out.println("Invalid Input...");
//		}
//	}
	
	public void showOutput() {
		System.out.println("College :: " + collegeName);
		System.out.println("Roll No is :: " + rollno);
		System.out.println("Name is :: " + name);
		System.out.println("Course is :: " + course);
		System.out.println("Address is :: " + address);
		System.out.println("Fees is :: " + fees);
	}

}
