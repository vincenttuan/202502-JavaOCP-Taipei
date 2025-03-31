package day10;

public class BMIB extends BMISemi {

	@Override
	public String getResult(double bmiValue) {
		String result = bmiValue <= 15 ? "過輕" : bmiValue > 25 ? "過重" : "正常";
		return result;
	}

}
