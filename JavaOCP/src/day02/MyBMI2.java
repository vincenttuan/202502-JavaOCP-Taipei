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
		// 第一組 bmi 要印到小數點 2 位
		// 第二組 bmi 要印出計算的原始資料
		double bmi1 = getBMI(h1, w1);
		System.out.printf("%.2f%n", bmi1);
		
		double bmi2 = getBMI(h2, w2);
		System.out.println(bmi2);
	}
	
	// 有回傳值方法
	public static double getBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi; // 將計算好的 bmi 回傳
	}
	
	// 無回傳值方法
	public static void calcBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
	}
	
}
