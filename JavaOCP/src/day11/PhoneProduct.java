package day11;

// 手機商品
public class PhoneProduct extends AbstractProduct {
	private String brand;
	
	public PhoneProduct(String name, int price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	@Override
	public void applyDiscount() {
		// 手機有 10% 的折扣 
		price = (int)(price * 0.9);
		System.out.printf("商品名稱:%s(%s) 折扣後價格:$%,d%n", name, brand, price);
	}
	
}
