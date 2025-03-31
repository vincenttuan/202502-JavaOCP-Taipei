package day10;

// BMI 規格
public interface BMI {
	// 計算並取得 BMI 的方法
	public double calcAndGet(double h, double w);
	
	// 判斷 BMI 結果的方法
	public String getResult(double bmi);
	
}
