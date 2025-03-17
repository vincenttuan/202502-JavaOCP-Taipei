package day06;

import java.util.Arrays;

public class OO6 {

	public static void main(String[] args) {
		Product p1 = new Product("漢堡", 2, 50);
		Product p2 = new Product("薯條", 3, 30);
		Product p3 = new Product("可樂", 5, 15);
		
		Product[] products = {p1, p2, p3};
		System.out.println(products);
		System.out.println(Arrays.toString(products));
		
		// 請問總花費 ?
		
	}

}
