package day21;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class YoubikeUtil {
	
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
	
	public static void main(String[] args) throws Exception {
		System.out.println(YoubikeUtil.getYoubikes().size());
	}
}
