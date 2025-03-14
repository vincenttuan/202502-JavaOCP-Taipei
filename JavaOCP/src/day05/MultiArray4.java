package day05;

public class MultiArray4 {
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
		printStudentInfo(students);
		System.out.println("------------------------");
		// 2.請計算並印出每一個學生的 bmi 值
		// 診斷 bmi <= 18 過輕 bmi > 23 過重, 其餘正常
		double sumOfBmi = printStudentBmiAndGetSumOfBmi(students);
		System.out.println("------------------------");
		// 3. 此班級學生 bmi 的平均 ?
		double avgOfBmi = sumOfBmi / students.length;
		System.out.printf("此班級學生 bmi 的平均:%.2f%n", avgOfBmi);
	}
	
	// 顯示學生的資料
	public static void printStudentInfo(double[][] students) {
		for(double[] student : students) {
			System.out.printf("座號:%.0f 身高:%.1f 體重:%.1f%n", student[0], student[1], student[2]);
		}
	}
	
	// 顯示每一個學生 bmi 值並
	public static double printStudentBmiAndGetSumOfBmi(double[][] students) {
		double sumOfBmi = 0;
		for(double[] student : students) {
			double bmi = getAndCalcBmi(student[1]/100, student[2]);
			sumOfBmi += bmi;
			String result = getBmiResult(bmi); 
			System.out.printf("座號:%.0f BMI:%.2f 診斷:%s%n", student[0], bmi, result);
		}
		return sumOfBmi;
	}
	
	// 計算 bmi
	public static double getAndCalcBmi(double h, double w) {
		double bmi = w / (h*h);
		return bmi;
	}
	
	// 診斷 bmi 狀態
	public static String getBmiResult(double bmi) {
		return (bmi <= 18) ? "過輕" : (bmi > 23) ? "過重" : "正常";
	}
}
