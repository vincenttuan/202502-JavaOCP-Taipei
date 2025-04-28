package day16;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		// 加入排隊的人
		queue.offer("Alice");
		queue.offer("Bob");
		queue.offer("Charlie");
		System.out.println("目前排隊的人:" + queue);
		
		// 模擬買票
		while (!queue.isEmpty()) { // 查看是否還有排隊的人
			String person = queue.poll(); // 取出對首的人
			System.out.println(person + "買了票, 目前排隊的人:" + queue);
		}
		
	}
}
