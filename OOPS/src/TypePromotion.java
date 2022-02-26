import java.util.LinkedList;

public class TypePromotion {
	
	void show(byte x) {
		System.out.println("Byte X...");
	}
	void show(short x) {
		System.out.println("Short X...");
	}
//	void show(int x) {
//		System.out.println("Int X...");
//	}
//	void show(long x) {
//		System.out.println("Long X...");
//	}
//	void show(float x) {
//		System.out.println("Float X...");
//	}
//	void show(double x) {
//		System.out.println("Double X...");
//	}
//	void show(Integer x) {
//		System.out.println("Integer X...");
//	}
	void show(Float x) {
		System.out.println("Float X...");
	}
	void show(int ...x) {
		System.out.println("Variable Length Arguments X...");
		int sum = 0;
		for(int i : x) {
			sum += i;
		}
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromotion obj = new TypePromotion();
		
		// JRE will give first chance to int
		// if int is not available then it will give chance to long
		// if long is not available then it will give chance to float
		// if float is not available then it will give chance to double
		// if double is not available then it will give chance to wrapper class of same data type
		// if wrapper class is not available then it will give chance to var args
		// obj.show(10);
		
		obj.show(2,4,5);
		obj.show(1,2,4,6,7);
		obj.show(1,2,3,4,6,7,8,5);
		
//		to call byte and short we need to perform type casting
//		obj.show((byte)10);
//		obj.show((short)10);
		
//		int x = 10;				// value variable
//		System.out.println(x);
//		Integer x1 = 10;		// reference variable
//		System.out.println(x1);
		
//		int x2 = x1;			// copy value
//		System.out.println(x2);
//		Integer x3 = x2;		// copy addresss
		
//		Integer x = 10;
//		int y = 10;
//		Integer y = 10;
//		System.out.println(x.compareTo(y));
//		When x is equals to y then it will return 0
//		When x is greater then y then it will return +1
//		When x is smaller then y then it will return -1
		
//		System.out.println(x.equals(y));
		
//		Autoboxing
		int x = 12;
		Integer y = x; 	// boxing
		
		int z = y;		// Unboxing
		
//		boxing - primitive can be converted into object
//		Unboxing - object can be converted into primitive
		
//		Old style of unboxing
		Integer i = new Integer(x);	// boxing
		int j = i.intValue();		// unboxing
		
		Integer c = new Integer(10);
		
//		LinkedList list = new LinkedList();
//		list.add(10);
//		list.add(i);
//		list.add(c);
//		Integer z1 = (Integer)list.get(0);
//		z1++;
//		int y1 = z1.intValue();
//		y1++;
//		z1 = new Integer(y1);
		
//		LinkedList<Integer> link = new LinkedList<>();
//		link.add(x);
//		Integer i2 = link.get(0);
//		int i3 = link.get(0);
//		i2++;
	}

}
