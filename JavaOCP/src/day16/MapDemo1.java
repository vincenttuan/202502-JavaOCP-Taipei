package day16;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo1 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> scores = new LinkedHashMap<>();
		scores.put("Tom", 85);
		scores.put("Amy", 92);
		scores.put("John", 76);
		scores.put("Mary", 98);
		scores.put("Jack", 45);
		scores.put("Rose", 66);
		System.out.println(scores);
		
		// 查詢 Amy 的成績
		System.out.println("Amy 的成績: " + scores.get("Amy"));
		
		// 判斷 Amy 是否存在, 若存在則印出成績
		if(scores.containsKey("Amy")) {
			System.out.println("Amy 的成績: " + scores.get("Amy"));
		} else {
			System.out.println("此人不存在");
		}
		
	}
	
}
