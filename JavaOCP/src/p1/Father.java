package p1;

public class Father {
	private String apple = "蘋果"; // 只有自己才可以使用
	String banana = "香蕉"; // 同資料夾下才可存取(不依定要有繼承)
	protected String cherry = "櫻桃"; // 可以跨資料夾存取但是要有繼承關係
	public String dragon = "火龍果"; // 大家都可以使用
}
