package day14;

import java.util.HashSet;
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
		
	}

}
