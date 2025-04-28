package day16;

import java.util.ArrayList;
import java.util.List;

// 運動選手
public class Sportsman {
	private String name; // 選手名字
	private List<Double> scores; // 選手成績列表
	
	public Sportsman(String line) {
		// 切割 line 的資訊
		String[] array = line.split(",");
		this.name = array[0];
		this.scores = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			scores.add(Double.parseDouble(array[i]));
		}
	}
	
}
