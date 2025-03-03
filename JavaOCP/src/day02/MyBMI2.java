package day02;

public class MyBMI2 {

	public static void main(String[] args) {
		// 第一組身高體重
		double h1 = 170, w1 = 60;
		// 第二組身高體重
		double h2 = 160, w2 = 50;
		// -----------------------------------------
		calcBMI(h1, w1);
		calcBMI(h2, w2);
		// -----------------------------------------
		
	}
	
	public static void calcBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
	}

}
