class A {
	A() {
		System.out.println("A Class Default Constructor Called...");
	}
	A(int x) {
		System.out.println("A Class Param Constructor Called...");
	}
}

class B extends A {
	B() {
		super(10);
//		super();	// it is written internally
		System.out.println("B Class Default Constructor Called...");
	}
	
	B(int x) {
		this();
		super(100);	 // Explicit Call
//		super();
		System.out.println("B Class Param Constructor Called...");
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B obj = new B();
		B obj = new B(10);
	}

}
