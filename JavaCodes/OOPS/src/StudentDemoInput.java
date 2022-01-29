// SRP - Single Responsibility Principle
class StudentDetailsB {
	int rollno;
	String name;
	String course;
	String address;
	double fees;
	
//	DRY - Donot Repeat Yourself
	public void takeInput(int rollno, String name, String course, String address, double fees) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.address = address;
		this.fees = fees;
	}
	
	public void showDetails() {
//		System.out.println(this);
		System.out.println("Roll No is :: " + rollno);
		System.out.println("Name is :: " + name);
		System.out.println("Course is :: " + course);
		System.out.println("Address is :: " + address);
		System.out.println("Fees is :: " + fees);
	}
	
}


public class StudentDemoInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailsB ram = new StudentDetailsB();
		ram.takeInput(101, "Ram", "Btech", "Delhi", 4500.00);
//		ram.fees = -1000;
		ram.showDetails();
		
		StudentDetailsB shyam = new StudentDetailsB();
		shyam.takeInput(102, "Shyam", "Btech", "Pune", 4500.00);
		shyam.showDetails();
	}

}
