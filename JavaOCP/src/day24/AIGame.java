package day24;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AIGame {
	// 遊戲
	public static final Map<Integer, String> GAME_MAP = Map.of(0, "剪刀", 1, "石頭", 2, "布");
	// 結果
	public static final Map<Integer, String> WINNER_MAP = Map.of(0, "平手", 1, "user贏", 2, "pc贏");  
	// 歷史紀錄
	public static List<String> history = new ArrayList<>();
	
	public static HttpClient client = HttpClient.newHttpClient();
	public static String path = "http://localhost:11434/api/chat";
	public static String model = "qwen2.5:latest";
	
	public static void play() throws Exception {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		for(int i=1;;i++) {
			if(i > 10) {
				// Ai 介入
				getAISuggestion();
			}
			System.out.printf("第 %02d 回:請輸入(0)剪刀 (1)石頭 (2)布:", i);
			int user = scanner.nextInt(); // User 出拳 
			if(user > 2 || user < 0) {
				System.out.println("離開遊戲");
				break;
			}
			int pc = random.nextInt(3); // 0, 1, 2 PC 出拳 
			// 判斷勝負 
			int result = (user - pc + 3) % 3;
			// 誰贏
			String roundResult = String.format("第%d回合: user出:%s pc出:%s 判定:%s", 
					i, GAME_MAP.get(user), GAME_MAP.get(pc), WINNER_MAP.get(result));
			// 顯示輸贏
			System.out.println(roundResult);
			// 存入歷史檔 
			history.add(roundResult);
		}
		scanner.close();
	}
	
	public static void getAISuggestion() throws Exception {
		String prompt = "這是剪刀石頭布的歷史紀錄:" + getHistory() + ",請根據這些紀錄, 建議我下一步該出什麼(剪刀,石頭,布)才能提高勝率, 只須回答一個選項";
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
		System.out.println(prompt);
		input = String.format(input, model, prompt);
		HttpClient client = HttpClient.newHttpClient();
		
		// 請求 request
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(path))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(input))
				.build();
		
		// 回應 response
		HttpResponse<Stream<String>> response = client.send(request, HttpResponse.BodyHandlers.ofLines());
		System.out.println(response);
		response.body().forEach(line -> {
			JsonObject json = JsonParser.parseString(line).getAsJsonObject();
			String content = json.getAsJsonObject("message").get("content").getAsString();
			System.out.print(content);
		});
		
		System.out.println();
	}
	
	private static String getHistory() {
		StringBuilder sb = new StringBuilder();
		for(String data : history) {
			sb.append("[").append(data).append("]");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		play();
	}
	
}
