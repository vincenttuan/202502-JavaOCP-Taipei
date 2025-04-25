package day15;

import java.util.HashSet;
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

	}

}
