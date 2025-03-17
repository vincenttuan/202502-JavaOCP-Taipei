package day06;

import java.util.stream.Stream;

public class OO3 {
	public static void main(String[] args) {
		Student s1 = new Student("John", 70);
		Student s2 = new Student("Mary", 40);
		Student s3 = new Student("Jack", 50);
		Student s4 = new Student("Rose", 90);
		Student s5 = new Student("Jean", 80);
		
		Student[] students = {s1, s2, s3, s4, s5};
		
		System.out.println("-------------------");
		// 請印出及格的學生姓名與分數
		for(Student student : students) {
			if(student.score >= 60) {
				System.out.println(student);
			}
		}
		
		System.out.println("-------------------");
		Stream.of(students)
			  .forEach(student -> {
				  if(student.score >= 60) {
					  System.out.println(student);
				  }
			  });
		
		System.out.println("-------------------");
		Stream.of(students)
			  .filter(student -> student.score >= 60)  // 只保留 score >= 60 的資訊
			  .forEach(student -> System.out.println(student));
		
		
	}
}
