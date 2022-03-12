interface K1 {
	default void show() {
		System.out.println("Show method of K1...");
	}
	void print();
}

interface K2 {
	default void show() {
		System.out.println("Show method of K2...");
	}
}

interface K3 extends K1, K2 {
	default void show() {
		K1.super.show();
		K2.super.show();
		System.out.println("Show method of K3...");
	}
}

class K implements K3 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

public class DefaultKeywordUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K obj = new K();
		obj.show();
	}

}
