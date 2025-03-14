package day05;

public class EqualsTest {

	public static void main(String[] args) {
		// == 與 equals()
		char c1 = 'A'; // A 的 ASCII = 65
		char c2 = 'A';
		int x = 65;
		System.out.println(c1 == c2);
		System.out.println(c1 == x);
		// ---------------------------------
		String s1 = new String("Java"); // 一般字串的宣告
		String s2 = new String("Java");
		System.out.println(s1 == s2);      // false
		System.out.println(s1.equals(s2)); // true
		// -- 特例 -------------------------------
		String s3 = "Java"; // 這種叫做"字面值"字串宣告, 相同的字串會共用位置
		String s4 = "Java";
		System.out.println(s3 == s4);      // true
		System.out.println(s3.equals(s4)); // true
		
	}

}
