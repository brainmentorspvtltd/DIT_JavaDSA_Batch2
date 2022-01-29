class StudentDetails {
	int rollno;
	String name;
	String course;
	String address;
	double fees;
}

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails ram = new StudentDetails();
		
		ram.rollno = 101;
		ram.name = "Ram";
		ram.course = "Btech";
		ram.address = "Delhi";
		ram.fees = 4500.00;
		
		System.out.println("Roll No is :: " + ram.rollno);
		System.out.println("Name is :: " + ram.name);
		System.out.println("Course is :: " + ram.course);
		System.out.println("Address is :: " + ram.address);
		System.out.println("Fees is :: " + ram.fees);
		
		
		StudentDetails shyam = new StudentDetails();
		
		shyam.rollno = 102;
		shyam.name = "Shyam";
		shyam.course = "Btech";
		shyam.address = "Pune";
		shyam.fees = 4500.00;
		
		System.out.println("Roll No is :: " + shyam.rollno);
		System.out.println("Name is :: " + shyam.name);
		System.out.println("Course is :: " + shyam.course);
		System.out.println("Address is :: " + shyam.address);
		System.out.println("Fees is :: " + shyam.fees);
	}

}
