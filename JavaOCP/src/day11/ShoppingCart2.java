package day11;

public class ShoppingCart2 {

	public static void main(String[] args) {
		Product p1 = new PhoneProduct("iPhone-16", 65000, "Apple");
		Product p2 = new PhoneProduct("Android-17", 45000, "Google");
		Product p3 = new ClothingProduct("Sweater", 800, "L");
		Product p4 = new ClothingProduct("T-Shirt", 500, "M");
		
		// 已購買的商品 
		Product[] products = {p1, p2, p3, p4};
		
		// 請計算出結帳金額(不折扣) = ?
		int total = 0;
		for(Product product : products) {
			total += product.getPrice();
		}
		System.out.printf("結帳金額(不折扣):$%,d%n", total);
		
		/*
		// 請計算出結帳金額(折扣) = ?
		int total2 = 0;
		for(Product product : products) {
			// 執行折扣程序
			((AbstractProduct)product).applyDiscount();
			total2 += product.getPrice();
		}
		System.out.printf("結帳金額(折扣):$%,d%n", total2);
		*/
		// 請計算出結帳金額(買手機有折扣,買衣服原價) = ?
		/*
		int total3 = 0;
		for(Product product : products) {
			if(product instanceof PhoneProduct) {
				((PhoneProduct)product).applyDiscount();
			}
			total3 += product.getPrice();
		}
		System.out.printf("結帳金額(買手機有折扣,買衣服原價):$%,d%n", total3);
		*/
		// 請計算出結帳金額(買 Apple 手機才有折扣,其他原價) = ?
		int total4 = 0;
		for(Product product : products) {
			if(product instanceof PhoneProduct) {
				PhoneProduct phoneProduct = (PhoneProduct)product;
				if(phoneProduct.getBrand().equals("Apple")) {
					phoneProduct.applyDiscount();
				}
			}
			total4 += product.getPrice();
		}
		System.out.printf("結帳金額(買 Apple 手機才有折扣,其他原價):$%,d%n", total4);
		
	}

}
