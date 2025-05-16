package day21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class PositionParam {
    private String positionlat;  //坐标纬度
    private String positionlng;  //坐标经度

}

public class GPSUtil {


    // 圆周率
    private static final Double PI = Math.PI;
    private static final Double PK = 180 / PI;
    private static final Double EARTH_RADII = 6370996.81;


    /**
     * 计算两个百度地图坐标实际距离：米
     *
     * @param sourcePosition
     * @param targetPosition
     * @return
     */
    public static double getDistanceByCoordinate(PositionParam sourcePosition, PositionParam targetPosition) {
        double o_lat = Double.valueOf(sourcePosition.getPositionlat());
        double o_lng = Double.valueOf(sourcePosition.getPositionlng());

        double d_lat = Double.valueOf(targetPosition.getPositionlat());
        double d_lng = Double.valueOf(targetPosition.getPositionlng());

        double t1 = Math.cos(o_lat / PK) * Math.cos(o_lng / PK) * Math.cos(d_lat / PK) * Math.cos(d_lng / PK);

        double t2 = Math.cos(o_lat / PK) * Math.sin(o_lng / PK) * Math.cos(d_lat / PK) * Math.sin(d_lng / PK);

        double t3 = Math.sin(o_lat / PK) * Math.sin(d_lat / PK);

        double tt = Math.acos(t1 + t2 + t3);

        return EARTH_RADII * tt;
    }

}
