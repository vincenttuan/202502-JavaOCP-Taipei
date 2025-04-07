package day11;

public class ShoppingCart {

	public static void main(String[] args) {
		PhoneProduct phone1 = new PhoneProduct("iPhone-16", 65000, "Apple");
		PhoneProduct phone2 = new PhoneProduct("Android-17", 35000, "Google");
		ClothingProduct clothing1 = new ClothingProduct("Sweater", 800, "L");
		ClothingProduct clothing2 = new ClothingProduct("T-Shirt", 500, "M");
		
		phone1.display();
		phone1.applyDiscount();
		System.out.println(phone1.getPrice());
		System.out.println();
		
		phone2.display();
		phone2.applyDiscount();
		System.out.println(phone2.getPrice());
		System.out.println();
		
		clothing1.display();
		clothing1.applyDiscount();
		System.out.println(clothing1.getPrice());
		System.out.println();
		
		clothing2.display();
		clothing2.applyDiscount();
		System.out.println(clothing2.getPrice());
		System.out.println();
		
	}

}
