package day16;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.push("英文課本");
		books.push("數學課本");
		books.push("歷史課本");
		System.out.println("箱子內的書: " + books);
		
		while(!books.empty()) {
			String book = books.pop();
			System.out.println("拿出書本: " + book + " 箱子內的書: " + books);
		}
	}

}
