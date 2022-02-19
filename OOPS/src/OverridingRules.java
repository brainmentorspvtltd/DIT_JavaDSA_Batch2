class Parent_1 {
//	Default Scope
	void show() {
		System.out.println("Parent_1 show call...");
	}
	
//	Protected Scope
	protected void print() {
		System.out.println("Parent_1 Print Called...");
	}
}

class Child_1 extends Parent_1 {
	@Override
//	Allowed Scopes = Public + Protected + Default
	protected void show() {
		System.out.println("Child_1 show call...");
	}
	
	@Override
	//	Allowed Scopes = Public + Protected
	public void print() {
		System.out.println("Parent_1 Print Called...");
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
