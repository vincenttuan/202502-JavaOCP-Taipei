package day05;

public class MultiArray3 {
	public static void main(String[] args) {
		// 5 個學生的 {座號, 身高, 體重} 的資料如下
		double[][] students = {
				{1, 170.0, 60.0},
				{2, 180.0, 90.0},
				{3, 160.0, 45.0},
				{4, 175.0, 55.0},
				{5, 183.0, 75.0},
		};
		// 1.請印出每一個學生的座號,身高與體重
		for(double[] student : students) {
			System.out.printf("座號:%.0f 身高:%.1f 體重:%.1f%n", student[0], student[1], student[2]);
		}
		System.out.println("------------------------");
		// 2.請計算並印出每一個學生的 bmi 值
		// 診斷 bmi <= 18 過輕 bmi > 23 過重, 其餘正常
		for(double[] student : students) {
			double h = student[1]/100;
			double w = student[2];
			double bmi = w / (h*h);
			String result = (bmi <= 18) ? "過輕" : (bmi > 23) ? "過重" : "正常"; 
			System.out.printf("座號:%.0f BMI:%.2f 診斷:%s%n", student[0], bmi, result);
		}
	}
}
