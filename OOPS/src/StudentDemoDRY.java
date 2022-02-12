class StudentDetailsA {
	int rollno;
	String name;
	String course;
	String address;
	double fees;
	
	public void showDetails() {
		System.out.println(this);
		System.out.println("Roll No is :: " + rollno);
		System.out.println("Name is :: " + name);
		System.out.println("Course is :: " + course);
		System.out.println("Address is :: " + address);
		System.out.println("Fees is :: " + fees);
	}
	
}

public class StudentDemoDRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetailsA ram = new StudentDetailsA();
		ram.rollno = 101;
		ram.name = "Ram";
		ram.course = "Btech";
		ram.address = "Delhi";
		ram.fees = 4500.00;
		
		System.out.println(ram);
		
		ram.showDetails();
		
		StudentDetailsA shyam = new StudentDetailsA();
		shyam.rollno = 102;
		shyam.name = "Shyam";
		shyam.course = "Btech";
		shyam.address = "Pune";
		shyam.fees = 4500.00;
		
		System.out.println(shyam);
		shyam.showDetails();

	}

}
