public class EmployeeSalarySlip {
//	Generate Salary Slip
//	Where
//	Earnings = Basic Salary + HRA (20%) + TA(10%) + DA(10%) + MA(15%)
//	Deductions = TDS (15%) + PF(10%)
//	Calculate Total Salary based on earning and deductions
	private int id;
	private String name;
	private double salary;
	private String email;
	private String company;
	
//	Default Constructor
	public EmployeeSalarySlip() {
		this.company = "Brain Mentors";
	}
	
//	Parameterized Constructor
	public EmployeeSalarySlip(int id, String name, double salary) {
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
	
	public double getHRA() {
		return salary * 0.15;
	}
	
	public double getTA() {
		return salary * 0.10;
	}
	
	public double getDA() {
		return salary * 0.08;
	}
	
	public double getTDS() {
		return salary * 0.12;
	}

	public String showEmp() {
		CommonUtils utils = new CommonUtils();
		this.name = utils.getProperName(name);
		
		this.salary = this.salary + getHRA() + getDA() + getTA() - getTDS();
		String formattedSalary = utils.formatSalary(salary);
		String date = utils.formatDate();

		return "Date : " + date + "\n" + "Name is : " + this.name + "\n" + "Net Salary is : " + formattedSalary;
		
	}
	
//	public void showEmp() {
////		String company = "BMPL";
//		EmpCommonUtils utils = new EmpCommonUtils();
//		this.name = utils.getProperName(name);
//		System.out.println("Company is : " + this.company);
//		System.out.println("ID is : " + id);
//		System.out.println("Name is : " + name);
//		System.out.println("Salary is : " + salary);
//		System.out.println("======================");
//	}
	
}
