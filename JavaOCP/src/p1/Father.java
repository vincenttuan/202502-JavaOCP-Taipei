package p1;

public class Father {
	private String apple = "蘋果";
	String banana = "香蕉"; // 不可跨資料夾存取
	protected String cherry = "櫻桃"; // 可以跨資料夾存取但是要有繼承關係
	public String dragon = "火龍果";
}
