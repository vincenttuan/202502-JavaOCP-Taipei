package day06;

import java.util.stream.Stream;

public class OO4 {
	public static void main(String[] args) {
		Student s1 = new Student("John", 70);
		Student s2 = new Student("Mary", 40);
		Student s3 = new Student("Jack", 50);
		Student s4 = new Student("Rose", 90);
		Student s5 = new Student("Jean", 80);
		
		Student[] students = {s1, s2, s3, s4, s5};
		
		System.out.println("-------------------");
		// 請印出總分與平均 ?
		int sum = 0;
		for(Student student : students) {
			sum += student.score;
		}
		System.out.printf("總分:%d 平均:%d%n", sum, (sum/students.length));
		
		System.out.println("-------------------");
		int sum2 = Stream.of(students) // [John, 70]->[Mary, 40]->[Jack, 50]->[Rose, 90]->[Jean, 80]
						  // mapToInt 將每一個元素"轉換"為 int
						 .mapToInt(student -> student.score) // [70]->[40]->[50]->[90]->[80]
						 .sum(); // 總和
		System.out.printf("總分:%d 平均:%d%n", sum2, (sum2/students.length));
		
		System.out.println("-------------------");
		double avg = Stream.of(students) // [John, 70]->[Mary, 40]->[Jack, 50]->[Rose, 90]->[Jean, 80]
				 		   .mapToInt(student -> student.score) // [70]->[40]->[50]->[90]->[80]
				 		   .average() // 平均
				 		   .getAsDouble(); // 取出平均的 double 值
		System.out.printf("總分:%d 平均:%.1f%n", sum2, avg);
						 
		
	}
}
