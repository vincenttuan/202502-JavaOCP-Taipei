package day15;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private int id; // 學號
	private String name; // 姓名
	private int score; // 成績
	private double height; // 身高
	private double weight; // 體重
	
}
