package day13;

import java.util.stream.Stream;

// 過濾商品是否有含特殊字串
interface NameFilter {
	boolean test(String productName, String keywordName);
}

public class LambdaTest3 {

	public static void main(String[] args) {
		String[] productNames = {
				"iPhone-15", "iPad-Air", "Google Pixel Pro", "iPhone-16", "Samsung Galaxy", "AirPods Pro"
		};
		// 請利用函數是程式設計過濾出 iPhone 手機有哪些?
		NameFilter nameFilter = (productName, keywordName) -> productName.contains(keywordName);
		filterProductName(productNames, nameFilter, "iPhone");

	}
	
	public static void filterProductName(String[] productNames, NameFilter nameFilter, String keywordName) {
		/*
		for(String productName : productNames) {
			if(nameFilter.test(productName, keywordName)) {
				System.out.println(productName);
			}
		}
		*/
		Stream.of(productNames)
			  .filter(productName -> nameFilter.test(productName, keywordName))
			  .forEach(productName -> System.out.println(productName));
	}

}
