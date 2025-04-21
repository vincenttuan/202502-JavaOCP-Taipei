package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// Set 元素不重複
		// HashSet 無序集合
		Set<String> set = new HashSet<>();
		set.add("國");
		set.add(null);
		set.add("英");
		set.add("數");
		System.out.println(set);
		// 利用 for-each 尋訪元素內容
		for(String data : set) {
			System.out.println(data);
		}
		System.out.println("----------");
		// 利用 Iterator 尋訪元素內容並且可以將不要的元素移除
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String data = iter.next(); // 得到元素
			if(data == null) {
				iter.remove();
			} else {
				System.out.println(data);
			}
		}
		System.out.println(set);

	}

}
