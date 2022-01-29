
public class StudentTest {

	public static void main(String[] args) {
		
		StudentReport ram = new StudentReport(101, "Ram", "Btech", "Delhi", 4500.00);
//		ram.takeInput(101, "Ram", "Btech", "Delhi", 4500.00);
//		ram.fees = -1000;
		ram.showOutput();
		
		StudentReport shyam = new StudentReport(102, "Shyam", "Btech", "Pune", 4500.00);
//		shyam.takeInput(102, "Shyam", "Btech", "Pune", 4500.00);
		shyam.showOutput();
	}

}
