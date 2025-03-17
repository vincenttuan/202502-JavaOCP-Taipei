package day06;

public class OO1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "John";
		s1.score = 70;
		
		Student s2 = new Student("Mary", 80);
		
		System.out.println(s1.name + ", " + s1.score);
		System.out.println(s2.name + ", " + s2.score);
		

	}

}
