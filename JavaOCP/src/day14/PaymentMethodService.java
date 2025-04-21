package day14;

public class PaymentMethodService {
	public static void main(String[] args) {
		
	}
	
	public static void pay(String method) {
		switch (method) {
			case PaymentMethod.CASH:
				System.out.println("進行人工" + method);
				break;
			case PaymentMethod.CREDIT_CARD:
				System.out.println("進行刷卡" + method);
				break;
			case PaymentMethod.MOBILE_PAY:
				System.out.println("進行掃描" + method);
				break;
			default:
				System.out.println("錯誤的支付: " + method);
		}
	}
	
}
