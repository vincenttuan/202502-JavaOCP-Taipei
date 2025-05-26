package day24;

import java.nio.file.Files;
import java.nio.file.Path;

public class AILottery {

	public static void main(String[] args) throws Exception {
		 String lotteryHistory = getLotteryHistory();
		 System.out.printf("539樂透歷史資料: %s%n", lotteryHistory);
	}
	
	private static String getLotteryHistory() throws Exception {
		return Files.readAllLines(Path.of("src/day24/lottery.txt")).toString().replaceAll("\t", " ");
	}

}
