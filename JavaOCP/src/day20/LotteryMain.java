package day20;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LotteryMain {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
		List<Lottery> lotteries = new CopyOnWriteArrayList<>();
		for(int i=1;i<=10;i++) {
			lotteries.add(new Lottery(i, list));
		}
		
		lotteries.forEach(lottery -> new Thread(lottery).start());
		
		while(list.size() != 10) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		System.out.println(list);

	}

}
