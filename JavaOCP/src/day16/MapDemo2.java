package day16;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// 一個學生有多組成績
		Map<String, List<Integer>> studentScores = new LinkedHashMap<>();
		studentScores.put("Tom", List.of(85, 90, 88, 92));
		studentScores.put("Amy", List.of(92, 91, 88, 85));
		studentScores.put("John", List.of(76, 78, 70, 80));
		System.out.println(studentScores);
		
		
	}

}
