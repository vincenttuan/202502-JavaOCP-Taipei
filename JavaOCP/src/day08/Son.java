package day08;

public class Son extends Father {
	public int balance = 1_0000; // 遮蔽屬性
	@Override // 覆寫方法
	public void play() {
		System.out.println("Game");
	}
}
