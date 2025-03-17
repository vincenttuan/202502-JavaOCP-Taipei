package day06;

public class Student {
	String name;
	int score;
	
	// 建構子 1
	public Student() {
		System.out.println("建立 Student 物件");
	}
	
	// 建構子 2
	public Student(String name, int score) {
		System.out.println("建立 Student 物件");
		this.name = name;
		this.score = score;
	}
	
}
