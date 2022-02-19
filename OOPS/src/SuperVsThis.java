class A {
	int p;
	int x;
	A() {
		x = 100;
		System.out.println("A Class Default Constructor Called...");
	}
	A(int x) {
		this();
		System.out.println("A Class Param Constructor Called...");
	}
}

class B extends A {
	int t;
	int x;
	B() {
		super(10);
		t = 100;
		x = 50;
//		super();	// it is written internally
		System.out.println("B Class Default Constructor Called...");
	}
	
	B(int x) {
		this();
//		super(100);	 // Explicit Call
//		super();
		int n = x + this.x + super.x;
//		x = x + t;
		System.out.println("B Class Param Constructor Called..."+n);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B obj = new B();
		B obj = new B(10);
	}

}
