@FunctionalInterface
interface Calc {
	int compute(int x, int y);
}


//class MyCalc implements Calc {
//	@Override
//	public int compute(int x, int y) {
//		System.out.println("Calculator App...");
//		return x + y;
//	}
//}

public class InterfaceUseWays {

	public static void main(String[] args) {
		
//		MyCalc obj = new MyCalc();
//		obj.compute(3,5);
		
//		this will create anonymous class
//		Calc obj = new Calc() {
//			@Override
//			public int compute(int x, int y) {
//				return x + y;
//			}
//		};
//		
//		System.out.println(obj.compute(5, 7));
		
//		Lambda Expression
//		Calc c = (a,b) -> a + b;
//		System.out.println(c.compute(5, 7));
		
		Calc c = (a,b) -> {
			int d = a + b;
			System.out.println("Doing addition...");
			return d;
		};
		System.out.println(c.compute(5, 6));

	}

}
