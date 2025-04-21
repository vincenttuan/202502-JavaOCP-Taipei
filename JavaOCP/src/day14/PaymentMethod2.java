package day14;

// 利用 enum 來改良
// enum 的建構子一定是 private, 若沒寫 java 編譯器也會自動加上 private 
public enum PaymentMethod2 {
	CASH("現金支付"), 
	CREDIT_CARD("進用卡支付"), 
	MOBILE_PAY("手機支付");
	
	private String value;
	
	private PaymentMethod2(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
