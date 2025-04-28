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
		
		
	}
	
}
