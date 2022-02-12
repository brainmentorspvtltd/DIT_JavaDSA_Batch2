//final class Parent {
//	
//}

class Parent {
//	private int x;
	private final void show() {
		System.out.println("Show method called...");
	}
}

class Child extends Parent {
	
//	@Override
//	void show() {
//		System.out.println("Child class show...");
//	}
}

public class FinalUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
//		System.out.println(Math.PI);
//		PI++;
	}

}
