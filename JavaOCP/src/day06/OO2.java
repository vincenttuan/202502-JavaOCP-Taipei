package day06;

import java.util.Arrays;
import java.util.stream.Stream;

public class OO2 {
	public static void main(String[] args) {
		Student s1 = new Student("John", 70);
		Student s2 = new Student("Mary", 40);
		Student s3 = new Student("Jack", 50);
		Student s4 = new Student("Rose", 90);
		Student s5 = new Student("Jean", 80);
		
		Student[] students = {s1, s2, s3, s4, s5};
		System.out.println(students);
		System.out.println(Arrays.toString(students));
		
		System.out.println("----------------------------");
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("----------------------------");
		for(Student student : students) {
			System.out.println(student);
		}
		
		System.out.println("----------------------------");
		Stream.of(students)
			  .forEach(student -> System.out.println(student));
		
		
		
	}
}
