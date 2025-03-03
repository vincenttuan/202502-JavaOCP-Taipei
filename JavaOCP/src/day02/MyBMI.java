package day02;

// 計算 bmi 值與診斷
public class MyBMI {

	public static void main(String[] args) {
		double h1 = 170, w1 = 60;
		double bmi1 = w1 / Math.pow(h1/100, 2); // Math.pow(x, y) => x 的 y 次方
		//double bmi1 = w1 / ((h1/100) * (h1/100));
		System.out.println(bmi1);
		
		double h2 = 160, w2 = 50;
		double bmi2 = w2 / Math.pow(h2/100, 2);
		System.out.println(bmi2);
		
		// ---------------------------------------
		
		calcBMI(170, 60);
		calcBMI(160, 50);
		
	}
	
	// 建立一個可計算與印出 bmi 值的方法
	// h, w 表示方法參數, 使用此方法的時候要帶入身高h與體重w
	public static void calcBMI(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
	}
	
	
	

}
