package day10;

public class BMIB implements BMI {

	@Override
	public double calcAndGet(double h, double w) {
		double bmiValue = w / Math.pow(h/100, 2);
		return bmiValue;
	}

	@Override
	public String getResult(double bmiValue) {
		String result = bmiValue <= 15 ? "過輕" : bmiValue > 25 ? "過重" : "正常";
		return result;
	}

}
