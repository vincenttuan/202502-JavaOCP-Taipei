package day12;

public class OuterTest {

	public static void main(String[] args) {
		
		Outer.Inner in = new Outer().new Inner();
		in.describe();
		
		Outer ou = new Outer();
		Outer.Inner in2 = ou.new Inner();
		in2.describe();
		
		new Outer().new Inner().describe();
	}

}
