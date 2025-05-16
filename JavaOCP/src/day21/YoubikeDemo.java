package day21;

import java.util.List;

public class YoubikeDemo {

	public static void main(String[] args) throws Exception {
		// 巨匠東認  25.041809, 121.550414
		PositionParam param1 = new PositionParam("25.041809", "121.550414");
		
		List<Youbike> youbikes = YoubikeUtil.getYoubikes();
		for(Youbike y : youbikes) {
			PositionParam param2 = new PositionParam(y.getLatitude()+"", y.getLongitude()+"");
			double m = GPSUtil.getDistanceByCoordinate(param2, param1);
			System.out.printf("距離巨匠東認: %,.1fm %s (%f, %f)%n", m, y.getSna(), y.getLatitude(), y.getLongitude());
		}
	}

}
