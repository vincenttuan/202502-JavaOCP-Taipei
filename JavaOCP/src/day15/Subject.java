package day15;

// 被觀察者所提供的主題服務
public interface Subject {
	void add(Observer observer); // 訂閱
	void remove(Observer observer); // 取消訂閱
	void notify(String message); // 發送通知
}
