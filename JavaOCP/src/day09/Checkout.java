package day09;

public class Checkout {
	
	// 現金結帳
	public void submit(int cash) {
		System.out.printf("現金結帳 金額:%d%n", cash);
	}
	
	public void submit(String cardNo, int cash) {
		System.out.printf("信用卡結帳 卡號:%s 金額:%d%n", cardNo, cash);
	}
	
	public void submit(int point, int cash) {
		System.out.printf("點數結帳 扣抵點數:%d 金額:%d%n", point, cash);
	}
	
	public void submit() {
		System.out.println("0元結帳");
	}
	
	
}
