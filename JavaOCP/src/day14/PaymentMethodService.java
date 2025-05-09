package day14;

public class PaymentMethodService {
	public static void main(String[] args) {
		/*
		pay(PaymentMethod.CASH);
		pay("現金支付");
		pay("我的臉");
		pay("我的手");
		pay("我的腳");
		pay("他的卡");
		*/
		pay2(PaymentMethod2.CASH);
		pay2(PaymentMethod2.CREDIT_CARD);
		pay2(PaymentMethod2.MOBILE_PAY);
	}
	
	public static void pay2(PaymentMethod2 method) {
		switch (method) {
			case CASH:
				System.out.println("進行人工" + method.getValue());
				break;
			case CREDIT_CARD:
				System.out.println("進行刷卡" + method.getValue());
				break;
			case MOBILE_PAY:
				System.out.println("進行掃描" + method.getValue());
				break;
		}
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
