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
		// 每一位學生的平均分數為何 ?
		for(Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
			String name = entry.getKey(); // 姓名
			List<Integer> scores = entry.getValue(); // 成績集合
			
			//double average = scores.stream().mapToInt(score -> score.intValue()).average().orElse(0);
			//double average = scores.stream().mapToInt(score -> score).average().orElse(0);
			double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0);
			System.out.printf("姓名: %s 平均: %.2f%n", name, average);
		}
	}

}
