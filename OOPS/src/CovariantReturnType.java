class X1 {
	int a,b,c;
}

class XPlus extends X1 {
	int d,e;
}

class Parent_2 {
//	String show() {
//		System.out.println("Parent Show Call");
//		return "Hello...";
//	}
	protected X1 show() {
		System.out.println("Parent Show...");
		X1 obj = new X1();
		return obj;
	}
}

class Child_2 extends Parent_2 {
	public XPlus show() {
		System.out.println("Child Show Call");
		XPlus obj = new XPlus();
		return obj;
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
