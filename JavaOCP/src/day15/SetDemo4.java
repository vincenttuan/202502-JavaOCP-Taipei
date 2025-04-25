package day15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class SetDemo4 {

	public static void main(String[] args) {
		// HashSet: 不在乎順序, 只求快
		// 使用情境: 快速查詢來賓是否有參加活動 party
		Set<String> party = new HashSet<>();
		party.add("小明");
		party.add("小華");
		party.add("小英");
		
		// 查詢是否報名
		//String user = "小明";
		String user = "小王";
		if(party.contains(user)) {
			System.out.printf("%s有報名%n", user);
		} else {
			System.out.printf("%s沒有報名%n", user);
		}
		
		// LinkedHashSet: 保留加入的順序
		// 使用情境: 記錄使用者最近購買的商品
		Set<String> shopping = new LinkedHashSet<>();
		shopping.add("iPhone");
		shopping.add("AirPods");
		shopping.add("iPad");
		//shopping.add("iPhone"); // 重複不能加入
		System.out.println("您最近點過的商品:");
		//shopping.forEach(p -> System.out.println(p));
		shopping.forEach(System.out::println); // :: 方法參考
		
		
		
		
		
		
	}

}
