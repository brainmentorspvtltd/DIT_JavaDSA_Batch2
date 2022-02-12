class X {
	private X() {
		System.out.println("X class constructor called...");
	}
}


public class ConstructorDemo {
	
	int x;
	int y;
	
//	X objX = new X();

//	Init block - executes even before constructor
	{
		System.out.println("Pre Constructor Call...");
	}
	
//	it is now our default constructor
//	private ConstructorDemo() {
//		System.out.println("Constructor Called...");
//		System.out.println("Object Created...");
//	}
	
	private ConstructorDemo(int x, int y) {
		System.out.println("Constructor Called...");
		System.out.println("Object Created...");
		this.x = x;
		this.y = y;
	}
	
//	ConstructorDemo c_obj = new ConstructorDemo();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj = new ConstructorDemo(5,7);
		
//		String str = new String("Hello");
		
	}

}
