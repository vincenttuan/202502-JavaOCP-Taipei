package day10;

public class BMIA implements BMI {

	@Override
	public double calcAndGet(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}

	@Override
	public String getResult(double bmi) {
		String result = bmi <= 18 ? "過輕" : bmi > 23 ? "過重" : "正常";
		return result;
	}
	
}
