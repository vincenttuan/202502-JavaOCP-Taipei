package day15;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class SetDemo5 {

	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		students.add(new Student(1, "John", 90, 170.0, 60.0));
		students.add(new Student(2, "Mary", 75, 160.0, 50.0));
		students.add(new Student(3, "Jack", 88, 180.0, 90.0));
		students.add(new Student(4, "Rose", 65, 165.5, 45.0));
		students.add(new Student(5, "Jean", 43, 163.5, 52.0));
		
		// 請問 students 學生名單中是否有 "Rose" 學生
		String name = "Mary";
		boolean hasName = students.stream()
								  .anyMatch(student -> student.getName().equals(name));
		if(hasName) {
			System.out.printf("%s 在學生名單中%n", name);
		} else {
			System.out.printf("%s 不在學生名單中%n", name);
		}
		
		// 總分與平均分數 = ?
		int totalScore = students.stream().mapToInt(Student::getScore).sum();
		double averageScore = students.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.printf("總分:%d 平均:%.1f%n", totalScore, averageScore);
		
		// 最高分是誰 ?
		Optional<Student> highest = students.stream()
											.max((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()));
													
		highest.ifPresent(student -> {
			System.out.printf("最高分是:%s 分數:%d%n", student.getName(), student.getScore());
		});
		
		// BMI 誰最低 ?
		Optional<Student> lowest = students.stream()
										   .min((s1, s2) -> Double.compare(s1.getBmi(), s2.getBmi()));
		lowest.ifPresent(student -> {
			System.out.printf("BMI最低的是:%s 數值:%.1f%n", student.getName(), student.getBmi());
		});
		
		
	}

}
