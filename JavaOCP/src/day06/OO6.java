package day06;

import java.util.Arrays;
import java.util.Optional;
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
		Optional<Product> optProduct = Stream.of(products)
										  	 .max((prod1, prod2) -> {
										  		 int cost1 = prod1.price*prod1.qty;
										  		 int cost2 = prod2.price*prod2.qty;
										  		 return Integer.compare(cost1, cost2);
										  	 });
		
		if(optProduct.isPresent()) {
			Product product = optProduct.get();
			System.out.println(product);
		} else {
			System.out.println("商品不存在");
		}
		//----------------------------------------------------------------------------
		Product maxProduct = Stream.of(products)
								   .max((prod1, prod2) -> {
									   int cost1 = prod1.price*prod1.qty;
									   int cost2 = prod2.price*prod2.qty;
									   return Integer.compare(cost1, cost2);
								   })
								   .get(); // 強迫取 Product 物件資料, 風險: 如無資料時則會出現錯誤~
		System.out.println(maxProduct);
		
	}

}
