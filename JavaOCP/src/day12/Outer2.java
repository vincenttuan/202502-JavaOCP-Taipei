package day12;

public class Outer2 {
	
	public void describe() {
		int x = 10; // 區域變數
		
		class Inner2 {
			void show() {
				System.out.println(x); // 區域變數 x 必須是 final 區域變數
			}
		}
		
		Inner2 inner2 = new Inner2();
		inner2.show();
	}
	
}
