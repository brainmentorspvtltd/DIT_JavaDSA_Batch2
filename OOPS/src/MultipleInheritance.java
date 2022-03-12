interface H1 {
	int x = 112;
	void show(int x);
	void print();
}

interface H2 {
	int x = 20;
	void show(int y);
}

interface H3 extends H1, H2 {
//	void show(int z);
}

class Mycls implements H3 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show(int x) {
		// TODO Auto-generated method stub
		System.out.println(H1.x + H2.x);
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
