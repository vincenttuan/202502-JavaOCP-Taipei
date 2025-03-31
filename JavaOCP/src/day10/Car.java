package day10;

// Car 規格
public interface Car {
	// 屬性(public static final 不可變更)
	int DOORS = 4; // public static final int DOORS = 4;
	
	// 方法(public abstract 無實作)
	String getName(); // public abstract String getName();
	String getPrice(); // public abstract String getPrice();
}
