package day24;

import java.nio.file.Files;
import java.nio.file.Path;

public class AILottery {

	public static void main(String[] args) throws Exception {
		 String lotteryHistory = getLotteryHistory();
		 System.out.printf("539樂透歷史資料: %s%n", lotteryHistory);
		 // 請透過 ollama 來預測下一期的539樂透開獎號碼
		 // 539是1~39取5個不會重複的號碼
	}
	
	private static String getLotteryHistory() throws Exception {
		return Files.readAllLines(Path.of("src/day24/lottery.txt")).toString().replaceAll("\t", " ");
	}

}
