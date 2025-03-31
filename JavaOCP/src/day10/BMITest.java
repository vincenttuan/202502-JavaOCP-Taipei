package day10;

public class BMITest {

	public static void main(String[] args) {
		BMI bmi = new BMIA();
		double bmiValue = bmi.calcAndGet(170.0, 70.0);
		System.out.println(bmiValue);
	}

}
