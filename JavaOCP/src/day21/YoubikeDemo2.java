package day21;

import java.util.List;

public class YoubikeDemo2 {

	public static void main(String[] args) throws Exception {
		// 巨匠東認  25.041809, 121.550414
		PositionParam param1 = new PositionParam("25.041809", "121.550414");
		
		List<Youbike> youbikes = YoubikeUtil.getYoubikes();
		int count = 0;
		for(Youbike y : youbikes) {
			PositionParam param2 = new PositionParam(y.getLatitude()+"", y.getLongitude()+"");
			double m = GPSUtil.getDistanceByCoordinate(param2, param1);
			if(y.getAvailable_rent_bikes() >= 50) {
				count++;
				System.out.printf("距離巨匠東認: %,.1fm 借/還: %d/%d 台 %s %s (%f, %f)%n", 
						m, y.getAvailable_rent_bikes(), y.getAvailable_return_bikes(), y.getSna(), y.getAr(), y.getLatitude(), y.getLongitude());
			}
		}
		System.out.printf("資料筆數: %d 筆%n", count);
	}

}
