package day09;

public class Tiger extends Cat {
	public Tiger() {
		super("老虎");
		System.out.println("Tiger 建構子");
	}
	
	@Override
	public void voice() {
		System.out.println("吼~~~");
	}
}
