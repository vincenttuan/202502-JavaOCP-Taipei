package day06;

import java.util.Arrays;
import java.util.stream.Stream;

public class OO6 {

	public static void main(String[] args) {
		Product p1 = new Product("漢堡", 2, 50);
		Product p2 = new Product("薯條", 3, 30);
		Product p3 = new Product("可樂", 5, 15);
		
		Product[] products = {p1, p2, p3};
		System.out.println(products);
		System.out.println(Arrays.toString(products));
		
		System.out.println("---------------");
		// 請問總花費 ?
		int total = 0;
		for(Product product : products) {
			total += product.price * product.qty;
		}
		System.out.println(total);
		
		System.out.println("---------------");
		int total2 = Stream.of(products)
						   .mapToInt(product -> product.price * product.qty)
						   .sum();
		System.out.println(total2);
		
		// 哪一個商品買最多錢
		
		
	}

}
