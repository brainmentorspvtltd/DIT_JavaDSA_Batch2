import java.util.Date;
import java.util.Scanner;

class Message {
	private String message;
	private Date date;
	private String userId;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}

class User {
	private String UserId;
	private String pwd;
	private String userName;
	private int age;
	private String city;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

class View {
	void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter User Id : ");
		String id = scanner.next();
		System.out.println();
		System.out.print("Enter User Password : ");
		String pwd = scanner.next();
		System.out.println();
		System.out.print("Enter User Name : ");
		String name = scanner.next();
		System.out.println();
		System.out.print("Enter User Age : ");
		int age = scanner.nextInt();
		System.out.println();
		System.out.print("Enter User City : ");
		String city = scanner.next();
		
		User user = new User();
		user.setUserId(id);
		user.setPwd(pwd);
		user.setUserName(name);
		user.setAge(age);
		user.setCity(city);
		
		DB db = new DB();
		Message msg = db.checkLogin(user);
//		db.checkLogin(id,pwd,name,age,city);
		System.out.println(msg.getMessage());
		System.out.println(msg.getDate());
		System.out.println(msg.getUserId());
	}
}

class DB {
	Message checkLogin(User user) {
//		String message = "";
//		Date date = null;
		Message msg = new Message();
		if(user.getUserId().equals(user.getPwd())) {
//			message = "Login Success...Welcome User";
			msg.setMessage("Login Success...Welcome User...");
		}
		else {
//			message = "Login Failed...";
			msg.setMessage("Login Failed...Invalid Id or Password...");
		}
//		date = new Date();
		msg.setDate(new Date());
		msg.setUserId(user.getUserId());
		return msg;
	}
}


public class PassingAndReturningObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View obj = new View();
		obj.login();
	}

}
