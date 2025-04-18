package day06;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class OO5 {
	public static void main(String[] args) {
		Student s1 = new Student("John", 70);
		Student s2 = new Student("Mary", 40);
		Student s3 = new Student("Jack", 50);
		Student s4 = new Student("Rose", 90);
		Student s5 = new Student("Jean", 80);
		
		Student[] students = {s1, s2, s3, s4, s5};
		
		System.out.println("-------------------");
		// 請印出總分, 平均, 最大值, 最小值與個數 => 統計資訊
		IntSummaryStatistics stat = Stream.of(students)
										  .mapToInt(student -> student.score) // 70->40->50->90->80
										  .summaryStatistics(); // 統計資訊物件
		System.out.println(stat);
		System.out.printf("總分:%d%n", stat.getSum());
		System.out.printf("平均:%.1f%n", stat.getAverage());
		System.out.printf("最大:%d%n", stat.getMax());
		System.out.printf("最小:%d%n", stat.getMin());
		System.out.printf("個數:%d%n", stat.getCount());
		System.out.println("-------------------");
		// 請問最高分與最低分的人名是 ?
		Student maxStudent = null;
		for(Student student : students) {
			if(maxStudent == null) {
				maxStudent = student;
				continue;
			}
			if(student.score > maxStudent.score) {
				maxStudent = student;
			}
		}
		System.out.println(maxStudent);
		System.out.println("-------------------");
		Student minStudent = null;
		for(Student student : students) {
			if(minStudent == null) {
				minStudent = student;
				continue;
			}
			if(student.score < minStudent.score) {
				minStudent = student;
			}
		}
		System.out.println(minStudent);
		System.out.println("-------------------");
		Student maxStudent2 = Stream.of(students)
									//       兩兩相比      ->   比整數 (stud1的分數, stud2的分數)
									.max((stud1, stud2) -> Integer.compare(stud1.score, stud2.score))
									.get();
		System.out.println(maxStudent2);
		System.out.println("-------------------");
		Student minStudent2 = Stream.of(students)
									.min((stud1, stud2) -> Integer.compare(stud1.score, stud2.score))
									.get();
		System.out.println(minStudent2);
		
	}
}
