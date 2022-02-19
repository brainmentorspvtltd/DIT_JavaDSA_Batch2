class P1 {
	int x = 100;
	P1() {
		System.out.println("P1 Constructor Called...");
	}
	void show() {
		System.out.println("P1 Show...");
	}
}

class P2 extends P1{
	int x = 200;
	int y = 50;
	
	P2() {
//		super();
		System.out.println("P2 Constructor Called...");
	}
	
	@Override
	void show() {
		System.out.println("P2 Show...");
	}
	void print() {
		System.out.println("P2 Print...");
	}
}

public class OverrideVariablesVsMethods {

	public static void main(String[] args) {
		P1 obj = new P2();
		obj.show();
//		variables are always binded with type of object
//		methods are always binded with object
		System.out.println(obj.x);
//		obj.y
//		obj.print();
	}

}
