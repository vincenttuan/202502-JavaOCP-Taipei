package day12;

public class PersonTest {

	public static void main(String[] args) {
		// 我要找一些臨時演員
		Person p1 = new Person() {
			public String getName() {
				return "小王";
			}
		};
		System.out.println(p1.getName());

	}

}
