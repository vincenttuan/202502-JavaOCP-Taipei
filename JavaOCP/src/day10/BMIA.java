package day10;

public class BMIA extends BMISemi {

	@Override
	public String getResult(double bmiValue) {
		String result = bmiValue <= 18 ? "過輕" : bmiValue > 23 ? "過重" : "正常";
		return result;
	}
	
}
