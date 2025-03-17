package day06;

import java.util.Arrays;

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
		
		
	}
}
