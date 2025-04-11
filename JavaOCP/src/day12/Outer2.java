package day12;

public class Outer2 {
	
	public void describe() {
		int x = 10;
		
		class Inner2 {
			void show() {
				System.out.println(x);
			}
		}
		
		Inner2 inner2 = new Inner2();
		inner2.show();
	}
	
}
