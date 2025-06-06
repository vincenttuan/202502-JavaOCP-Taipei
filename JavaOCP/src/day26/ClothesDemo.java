package day26;

public class ClothesDemo {

	public static void main(String[] args) {
		ClothesService service = new ClothesService(3); // 3 台洗衣機
		
		// 模擬 5 位顧客送洗衣服
		Clothes[] clothes = {
				new Clothes("小明"), new Clothes("小華"), new Clothes("小美"), 
				new Clothes("小強"), new Clothes("小英")
		};
		
		

	}

}
