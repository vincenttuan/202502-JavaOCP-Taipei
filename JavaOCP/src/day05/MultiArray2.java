package day05;

import java.util.Arrays;

public class MultiArray2 {
	public static void main(String[] args) {
		// 井字遊戲
		char[][] ttt = {
				{' ', ' ', ' '}, 
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
		
		printTTT(ttt);
		
		
	}
	
	// 印出 ttt 的資訊
	private static void printTTT(char[][] ttt) {
		for(char[] t : ttt) {
			System.out.println(Arrays.toString(t));
		}
		System.out.println("---------");
	}
	
}
