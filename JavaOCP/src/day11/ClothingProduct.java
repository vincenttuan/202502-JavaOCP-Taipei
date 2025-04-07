package day11;

// 服飾商品
public class ClothingProduct extends AbstractProduct {
	
	private String size;
	
	public ClothingProduct(String name, int price, String size) {
		super(name, price);
		this.size = size;
	}

	@Override
	public void applyDiscount() {
		// 服飾有 -200 的折扣 
		price -= 200;
		if(price < 0) {
			price = 0;
		}
		
		System.out.printf("商品名稱:%s(%s) 折扣後價格:$%d%n", name, size, price);
	}
	
}
