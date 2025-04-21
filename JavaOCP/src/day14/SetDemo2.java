package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("國");
		set.add(null);
		set.add("100");
		set.add("英");
		set.add("數");
		System.out.println(set);
		// 如何移除 null 與 100 元素 ?
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String data = iter.next();
			if(data == null || data.equals("100")) {
				iter.remove();
			}
		}
		System.out.println(set);
		System.out.println("------------------------------");
	}

}
