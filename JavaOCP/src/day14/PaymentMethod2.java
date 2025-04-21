package day14;

// 利用 enum 來改良
public enum PaymentMethod2 {
	CASH("現金支付"), 
	CREDIT_CARD("進用卡支付"), 
	MOBILE_PAY("手機支付");
	
	private String value;
	
	PaymentMethod2(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
