class GrandFather {
	int age = 100;
}

class Father extends GrandFather {
	int age = 55;
}

class Son extends Father {
	int age = 22;
	Son(int age) {
		System.out.println("GrandFather Age is : " + ((GrandFather)this).age);
		System.out.println("Father Age is : " + super.age);
		System.out.println("Son Age is : " + this.age);
		System.out.println("Son Local Age is : " + age);
		int total = age + this.age + super.age + ((GrandFather)this).age;
		System.out.println(total);
	}
}

public class MultiLevelHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj  = new Son(10);
	}

}
