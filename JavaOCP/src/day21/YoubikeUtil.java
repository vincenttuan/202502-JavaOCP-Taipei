package day21;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class YoubikeUtil {
	
	private static Connection connection = MySQLConnection.getConnection();
	
	private static String getYoubikeJsonFromTaipeiData() throws Exception {
		String urlString = "https://tcgbusfs.blob.core.windows.net/dotapp/youbike/v2/youbike_immediate.json";
		InputStream inputStream = new URL(urlString).openStream();
		String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
		return content;
	}
	
	public static List<Youbike> getYoubikes() throws Exception {
		String content = getYoubikeJsonFromTaipeiData();
		Gson gson = new Gson();
		// 定義要轉換的目標型別: List<Youbike>
		// 但是由於 Java 的 <泛型> 會再編譯時被抹除, 所以這裡需要用 TyppToken 幫助 Gson 知道正確的型別
		Type listType = new TypeToken<List<Youbike>>() {}.getType();
		// 將 json 字串(content) 轉為 List<Youbike> 集合物件
		List<Youbike> youbikes = gson.fromJson(content, listType);
		return youbikes;
	}
	
	public void saveOrUpdateYoubike(Youbike y) throws Exception {
		String sql = Files.readString(Path.of("day21/youbike新增與修改.sql"));
		try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, y.getSno());
			pstmt.setString(2, y.getSna());
			pstmt.setString(3, y.getSarea());
			pstmt.setString(4, y.getMday());
			pstmt.setString(5, y.getAr());
			pstmt.setString(6, y.getSareaen());
			pstmt.setString(7, y.getSnaen());
			pstmt.setString(8, y.getAren());
			pstmt.setString(9, y.getAct());
			pstmt.setString(10, y.getSrcupdatetime());
			pstmt.setString(11, y.getUpdatetime());
			pstmt.setString(12, y.getInfotime());
			pstmt.setDate(13, new java.sql.Date(y.getInfodate().getTime()));
			pstmt.setInt(14, y.getTotal());
			pstmt.setInt(15, y.getAvailableRentBikes());
			pstmt.setDouble(16, y.getLatitude());
			pstmt.setDouble(17, y.getLongitude());
			pstmt.setInt(18, y.getAvailableReturnBikes());
			// update
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(YoubikeUtil.getYoubikes().size());
	}
}
