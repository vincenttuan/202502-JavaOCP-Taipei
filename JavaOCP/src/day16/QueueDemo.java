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
		
		
		
	}
}
