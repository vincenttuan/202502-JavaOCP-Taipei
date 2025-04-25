package day15;

import java.util.HashSet;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class SetDemo4 {

	public static void main(String[] args) {
		// HashSet 不在乎順序, 只求快
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

	}

}
