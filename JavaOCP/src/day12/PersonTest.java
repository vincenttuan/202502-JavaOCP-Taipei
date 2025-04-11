package day12;

import java.util.stream.Stream;

public class PersonTest {

	public static void main(String[] args) {
		// 我要找一些臨時演員
		Person p1 = new Person() {
			public String getName() {
				return "小王";
			}
		};
		System.out.println(p1.getName());
		//-------------------------------
		// 因為該 Person interface 只有一個待實作的方法
		// 因此該 interface 也稱為 @FunctionalInterface
		// 所以可以使用 lambda 語法 !
		Person p2 = () -> { 
			return "小李";
		};
		System.out.println(p2.getName());
		
		Person p3 = () -> "小陳";
		System.out.println(p3.getName());
		//-------------------------------
		Person[] persons = {p1, p2, p3};
		for(Person person : persons) {
			System.out.println(person.getName());
		}
		//-------------------------------
		Stream.of(persons)
			  .forEach(person -> {
				  System.out.println(person.getName());  
			  });
		//-------------------------------
		Stream.of(persons)
		  	  .forEach(person -> System.out.println(person.getName()));
		
	}

}
