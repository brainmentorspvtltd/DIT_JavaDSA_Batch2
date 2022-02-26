/*
 * No of arguments can be change
 * Type of arguments can be change
 * Order of arguments can be change
 */

class OnlineShop {
	public String search(String brand) {
		System.out.println("Search by brand...");
		String query = "SELECT * FROM products where brand = "+brand;
		return null;
	}
	
	public void search(String brand, String name) {
		System.out.println("Search by name and brand...");
		String query = "SELECT * FROM products where brand = "+brand+"AND name = "+name;
	}
	
	public void search(double price) {
		System.out.println("Search by price...");
		String query = "SELECT * FROM products where price = ";
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
