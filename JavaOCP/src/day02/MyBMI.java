package day02;

// 計算 bmi 值與診斷
public class MyBMI {

	public static void main(String[] args) {
		double h1 = 170, w1 = 60;
		double bmi1 = w1 / Math.pow(h1/100, 2); // Math.pow(x, y) => x 的 y 次方
		//double bmi1 = w1 / ((h1/100) * (h1/100));
		System.out.println(bmi1);
		
	}

}
