package day15;

import java.util.ArrayList;
import java.util.List;

// 新問主題
public class NewsSubject implements Subject {
	
	private List<Observer> users = new ArrayList<>();
	
	@Override
	public void add(Observer observer) {
		users.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		users.remove(observer);
	}

	@Override
	public void notify(String message) {
		// 對每一個有訂閱的 user 發送訊息
		users.forEach(user -> user.update(message));
	}

}
