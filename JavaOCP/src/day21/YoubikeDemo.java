package day21;

import java.util.List;

public class YoubikeDemo {

	public static void main(String[] args) throws Exception {
		// 巨匠東認  25.041809, 121.550414
		List<Youbike> youbikes = YoubikeUtil.getYoubikes();
		for(Youbike y : youbikes) {
			System.out.printf("%s (%f, %f)%n", y.getSna(), y.getLatitude(), y.getLongitude());
		}
	}

}
