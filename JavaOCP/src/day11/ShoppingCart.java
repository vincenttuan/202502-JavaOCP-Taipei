package day11;

public class ShoppingCart {

	public static void main(String[] args) {
		PhoneProduct phone1 = new PhoneProduct("iPhone-16", 65000, "Apple");
		PhoneProduct phone2 = new PhoneProduct("Android-17", 35000, "Google");
		ClothingProduct clothing1 = new ClothingProduct("Sweater", 800, "L");
		ClothingProduct clothing2 = new ClothingProduct("T-Shirt", 500, "M");
		
		phone1.display();
		phone1.applyDiscount();
		
		
	}

}
