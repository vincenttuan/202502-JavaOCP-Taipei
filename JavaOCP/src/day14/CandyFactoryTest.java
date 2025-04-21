package day14;

public class CandyFactoryTest {

	public static void main(String[] args) {
		CandyFactory.Candy candy = new CandyFactory.Candy("草莓口味跳跳糖");
		candy.display();
		
		CandyFactory.Machine machine = new CandyFactory().new Machine();
		machine.display();
	}

}
