class OnlineShop {
	public void search(String brand) {
		System.out.println("Search by brand...");
	}
	
	public void search(String brand, String name) {
		System.out.println("Search by name and brand...");
	}
	
	public void search(double price) {
		System.out.println("Search by price...");
	}
	
	public void search(String brand, double price) {
		System.out.println("Search by brand and price...");
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineShop shop = new OnlineShop();
//		shop.search(null, null);

	}

}
