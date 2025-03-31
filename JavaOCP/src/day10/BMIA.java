package day10;

public class BMIA implements BMI {

	@Override
	public double calcAndGet(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}

	@Override
	public String getResult(double bmiValue) {
		String result = bmiValue <= 18 ? "過輕" : bmiValue > 23 ? "過重" : "正常";
		return result;
	}
	
}
