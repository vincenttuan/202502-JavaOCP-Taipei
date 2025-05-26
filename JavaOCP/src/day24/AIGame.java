package day24;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AIGame {
	// 遊戲
	public static final Map<Integer, String> GAME_MAP = Map.of(0, "剪刀", 1, "石頭", 2, "布");
	// 結果
	public static final Map<Integer, String> WINNER_MAP = Map.of(0, "平手", 1, "user贏", 2, "pc贏");  
	
	public static void play() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		for(int i=0;;i++) {
			System.out.printf("第 %02d 回:請輸入(0)剪刀 (1)石頭 (2)布:", i);
			int user = scanner.nextInt(); // User 出拳 
			if(user > 2 || user < 0) {
				System.out.println("離開遊戲");
				break;
			}
			int pc = random.nextInt(3); // 0, 1, 2 PC 出拳 
			// 判斷勝負 
			int result = (user - pc + 3) % 3;
			// 誰贏
			System.out.println(WINNER_MAP.get(result));
		}
	}
	
	public static void main(String[] args) {
		play();
	}
	
}
