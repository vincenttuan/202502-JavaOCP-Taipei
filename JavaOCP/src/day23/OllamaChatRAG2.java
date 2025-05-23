package day23;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OllamaChatRAG2 {
	
	// 模擬一個小型知識庫
	static String knowledge;
	
	static {
		try {
			knowledge = Files.readAllLines(Path.of("src/day23/snack.txt")).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		String path = "http://localhost:11434/api/chat";
		String model = "qwen2.5:latest";
		//---------------------------------------------------------------
		String promptTemplate1 = "以下是相關資料:(%s), 請根據這些資料回答問題:(%s)";
		String promptTemplate2 = "以下是相關資料:(%s), 請根據這些資料回答問題:(%s), 若找不到商品就不賣";
		String promptTemplate3 = "請問一般坊間價格是多少:(%s)";
		// 透過選擇不同的 promptTemplate 來決定你的 prompt
		//String prompt = String.format(promptTemplate1, knowledge, "我要買8個蚵仔煎加臭豆腐2盤加小杯可樂1杯多少錢?");
		//String prompt = String.format(promptTemplate2, knowledge, "我要買8個蚵仔煎加臭豆腐2盤加小杯可樂1杯多少錢?");
		String prompt = String.format(promptTemplate3, "我要買8個蚵仔煎加臭豆腐2盤加小杯可樂1杯多少錢?");
		//---------------------------------------------------------------
		String input = "{"
				+ "  \"model\": \"%s\", "
				+ "  \"stream\": true, "
				+ "  \"messages\": [ "
				+ "    { "
				+ "      \"role\": \"user\", "
				+ "      \"content\": \"%s\" "
				+ "    } "
				+ "  ]"
				+ "}";
		input = String.format(input, model, prompt);
		
		System.out.println(input);
		
		System.out.println("傳送資料...");
		HttpClient client = HttpClient.newHttpClient();
		
		// 請求 request
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(path))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(input))
				.build();
		
		// 回應 response
		HttpResponse<Stream<String>> response = client.send(request, HttpResponse.BodyHandlers.ofLines());
		
		response.body().forEach(line -> {
			// {"model":"qwen2.5:0.5b","created_at":"2025-05-23T11:51:53.0757969Z","message":{"role":"assistant","content":"尽力"},"done":false}
			JsonObject json = JsonParser.parseString(line).getAsJsonObject();
			String content = json.getAsJsonObject("message").get("content").getAsString();
			System.out.print(content);
		});
		
		System.out.println();
	}

}
