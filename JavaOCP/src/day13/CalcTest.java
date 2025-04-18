package day13;

public class CalcTest {
	public static void main(String[] args) {
		Calc<Integer> calc1 = (x, y) -> x + y;
		System.out.println(calc1.add(10, 20));
		
		Calc<Double> calc2 = (x, y) -> x + y;
		System.out.println(calc2.add(10.5, 3.1));
		
		Calc<String> calc3 = (x, y) -> x + y;
		System.out.println(calc3.add("Java", "17"));
	}
}
