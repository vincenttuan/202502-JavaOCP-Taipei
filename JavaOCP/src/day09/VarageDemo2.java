package day09;

public class VarageDemo2 {

	public static void main(String[] args) {
		System.out.println(calc(10, 20));
		System.out.println(calc(10, 20, 30));
		int[] values = {10, 20, 30, 40, 50};
		System.out.println(calc(values));
		System.out.println(calc());
	}
	
	public static int calc(int... values) {
		int sum = 0;
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	
	
}
