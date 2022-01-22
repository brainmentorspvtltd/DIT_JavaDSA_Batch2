public class OopsDemo {
	int x = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;		// x is a primitive variable type of int
		
		OopsDemo obj = new OopsDemo();
		// obj is a reference variable type of OopsDemo
		// new is a keyword used to allocate memory to your object
		// you are calling class like we call a function
		// it means in OOPS it's a constructor...
		// constructor is nothing just constructing an object
		
		System.out.println(obj);	// internally calls toString
		System.out.println(obj.toString());
		System.out.println(obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode()));
	}

}
