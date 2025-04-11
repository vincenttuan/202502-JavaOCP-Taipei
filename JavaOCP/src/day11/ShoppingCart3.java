package day11;

import java.util.stream.Stream;

public class ShoppingCart3 {

	public static void main(String[] args) {
		Product p1 = new PhoneProduct("iPhone-16", 65000, "Apple");
		Product p2 = new PhoneProduct("Android-17", 45000, "Google");
		Product p3 = new ClothingProduct("Sweater", 800, "L");
		Product p4 = new ClothingProduct("T-Shirt", 500, "M");
		
		// 已購買的商品 
		Product[] products = {p1, p2, p3, p4};
		
		// 請計算出結帳金額(不折扣) = ?
		int total = Stream.of(products)
						  .mapToInt(p -> p.getPrice()).sum();
		System.out.printf("結帳金額(不折扣):$%,d%n", total);
		
		// 請計算出結帳金額(折扣) = ?
		int total2 = Stream.of(products)
						   .peek(p -> ((AbstractProduct)p).applyDiscount())
						   .mapToInt(p -> p.getPrice()).sum();
		System.out.printf("結帳金額(折扣):$%,d%n", total2);
		
		// 請計算出結帳金額(買手機有折扣,買衣服原價) = ?
		int total3 = Stream.of(products)
				   .peek(p -> {
					   if(p instanceof PhoneProduct) {
						   ((PhoneProduct)p).applyDiscount();
					   }
				   })
				   .mapToInt(p -> p.getPrice()).sum();
		System.out.printf("結帳金額(買手機有折扣,買衣服原價):$%,d%n", total3);
		
		// 請計算出結帳金額(買 Apple 手機才有折扣,其他原價) = ?
		int total4 = Stream.of(products)
				   .peek(p -> {
					   if(p instanceof PhoneProduct) {
						   PhoneProduct phoneProduct = ((PhoneProduct)p); 
						   if(phoneProduct.getBrand().equals("Apple")) {
							   phoneProduct.applyDiscount();
						   }
					   }
				   })
				   .mapToInt(p -> p.getPrice()).sum();
		System.out.printf("結帳金額(買 Apple 手機才有折扣,其他原價):$%,d%n", total4);
		
	}

}
