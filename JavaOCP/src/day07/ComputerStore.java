package day07;

import java.util.stream.Stream;

public class ComputerStore {

	public static void main(String[] args) {
		CPU cpu1 = new CPU("i7-15", 28000);
		CPU cpu2 = new CPU("i5-01", 3000);
		RAM ram1 = new RAM("4G", 800);
		RAM ram2 = new RAM("32G", 2800);
		HD hd1 = new HD("500G", 500);
		HD hd2 = new HD("2TB", 2500);
		// 幫我透過 Computer 組合一台"電競電腦" 與一台"文書電腦"
		// 請問這二台電腦要花費多少錢 ?
		Computer computer1 = new Computer("電競電腦", cpu1, ram2, hd2);
		Computer computer2 = new Computer("文書電腦", cpu2, ram1, hd1);
		int totalPrice = computer1.getPrice() + computer2.getPrice();
		System.out.printf("總價:%,d%n", totalPrice);
		// 利用串流計算出總價 ?
		int totalPrice2 = Stream.of(computer1, computer2)
								.mapToInt(computer -> computer.getPrice())
								.sum();
		System.out.printf("總價:%,d%n", totalPrice2);
	}

}
