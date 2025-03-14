package day05;

public class StringTest {

	public static void main(String[] args) {
		String s = "Java";
		s = s.concat("11"); // concat 連接字串
		//s.concat("11"); // concat 連接字串, 少了 s = 所以 s 仍是指向 "Java"
		System.out.println(s);
		// ------------------------------------
		String s2 = "Web";
		//s2 = s2.replace('W', 'w');
		s2.replace('W', 'w');
		System.out.println(s2);

	}

}
