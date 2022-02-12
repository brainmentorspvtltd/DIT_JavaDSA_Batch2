class Emp {
	private int id;
	private String name;
	private double salary;
	private String email;
	private String company;
	
//	Default Constructor
	public Emp() {
		this.company = "Brain Mentors";
	}
	
//	Parameterized Constructor
	public Emp(int id, String name, double salary) {
		this(); // calling default constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void showEmp() {
//		String company = "BMPL";
		EmpCommonUtils utils = new EmpCommonUtils();
		this.name = utils.getProperName(name);
		System.out.println("Company is : " + this.company);
		System.out.println("ID is : " + id);
		System.out.println("Name is : " + name);
		System.out.println("Salary is : " + salary);
		System.out.println("======================");
	}
	
}

class EmpCommonUtils {
	public String getProperName(String name) {
		/*
		 * name = "john CeNa"; 
		 * nameArr = ["john", "CeNa"];
		 */
		String nameArr[] = name.split(" ");
		String properName = "";
		for (String n : nameArr) {
			properName += String.valueOf(n.charAt(0)).toUpperCase() + 
					n.substring(1).toLowerCase() + " ";
		}
		return properName;
		
	}
}


public class EmpSalarySlipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp john = new Emp(101, "John Cena", 56000);
		Emp tom = new Emp(102, "tom hardy", 46000);
		Emp sam = new Emp(103, "sam abraham", 50000);
		Emp mac = new Emp(104, "mac xyz", 35000);
		
		john.showEmp();
		tom.showEmp();
		
//		john.setSalary(john.getSalary() + 5000);
		
//		double salary = john.getSalary();
//		salary = salary - 5000;
//		System.out.println(salary);
//		System.out.println(john.getSalary());
//		
//		john.setSalary(salary);
//		System.out.println(john.getSalary());

	}

}
