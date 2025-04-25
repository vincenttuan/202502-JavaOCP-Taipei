package day15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		//List<Integer> scores = new ArrayList<>();
		List<Integer> scores = new LinkedList<>();
		scores.add(95);
		scores.add(88);
		scores.add(100);
		scores.add(45);
		scores.add(66);
		scores.add(100);
		System.out.println(scores);
		System.out.println(scores.get(0)); // 第一筆
		System.out.println(scores.get(scores.size()-1)); // 最末筆
		// 插入指定位置
		scores.add(4, 77);
		System.out.println(scores);
		scores.remove(1); // 刪除1位置(88)的資料
		System.out.println(scores);
		scores.remove(Integer.valueOf(45)); // 刪除內容物是45的資料
		System.out.println(scores);
		// 尋訪元素
		for(int i=0;i<scores.size();i++) {
			System.out.println(scores.get(i));
		}
		System.out.println("-------");
		for(int i=scores.size()-1;i>=0;i--) {
			System.out.println(scores.get(i));
		}
	}

}
