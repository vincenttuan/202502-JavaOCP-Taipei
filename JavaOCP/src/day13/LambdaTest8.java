package day13;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaTest8 {
	public static void main(String[] args) {
		String[] productNames = {
				"iPhone-15(Hot)", "iPad-Air", "Google Pixel Pro(Hot)", 
				"iPhone-16", "Samsung Galaxy", "AirPods Pro(Hot)"
		};
		// 1. 利用 Predicate 篩選出熱門商品 (Hot)
		Predicate<String> filterHot = (name) -> name.contains("Hot");
		
		// 2. 利用 Function 轉換名稱加上 🔥 圖樣
		Function<String, String> mapName = (name) -> "🔥 " + name;
		
		// 3. 利用 Consumer 印出熱門商品
		Consumer<String> printName = (name) -> System.out.println(name);
		
		// 整合
		Stream.of(productNames)
			  .filter(filterHot)
			  .map(mapName)
			  .forEach(printName);
		
	}
}
