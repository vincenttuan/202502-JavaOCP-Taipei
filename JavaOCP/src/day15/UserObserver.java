package day15;

import lombok.AllArgsConstructor;

// 觀察者/使用者
@AllArgsConstructor
public class UserObserver implements Observer {
	private String name;
	
	@Override
	public void update(String message) {
		System.out.printf("%s 收到一則訊息: %s%n", name, message);
	}
	
}
