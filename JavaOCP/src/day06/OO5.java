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
		
	}
}
