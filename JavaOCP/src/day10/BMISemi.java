package day10;

// 抽象類
public abstract class BMISemi implements BMI {

	@Override
	public double calcAndGet(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	}

}
