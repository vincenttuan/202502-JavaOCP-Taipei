package day15;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<>();
		scores.add(95);
		scores.add(88);
		scores.add(100);
		scores.add(1, 45);
		scores.add(66);
		scores.add(100);
		System.out.println(scores);
		System.out.println(scores.get(0)); // 第一筆
		System.out.println(scores.get(scores.size()-1)); // 最末筆
		
		
		
	}

}
