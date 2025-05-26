package day24;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AILottery {

	

	// AI 建議
	public static void printAISuggestion(String path, HttpClient client, String prompt) throws Exception {
		// 請求 request
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(path)).header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(prompt)).build();

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

	public static String getPrompt(String model, String history) throws Exception {
		String prompt = "今彩539(所謂今彩539是1~39任意取出5個不會重複的數字)歷史紀錄如下:" + history + ",請根據這些紀錄, 請預測下一次開獎號碼";
		String input = "{" + "  \"model\": \"%s\", " + "  \"stream\": true, " + "  \"messages\": [ " + "    { "
				+ "      \"role\": \"user\", " + "      \"content\": \"%s\" " + "    } " + "  ]" + "}";
		System.out.println(prompt);
		input = String.format(input, model, prompt);
		return input;
	}

	public static void main(String[] args) throws Exception {
		// 請透過 ollama 來預測下一期的539樂透開獎號碼
		// 539是1~39取5個不會重複的號碼
		Runnable r1 = () -> {
			try {
				HttpClient client = HttpClient.newHttpClient();
				String path = "http://localhost:11434/api/chat";
				String model = "qwen2.5:latest";
				String lotteryHistory = getLotteryHistory();
				System.out.printf("539樂透歷史資料: %s%n", lotteryHistory);
				String prompt = getPrompt(model, lotteryHistory);
				printAISuggestion(path, client, prompt);
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
		new Thread(r1).start();

	}

	private static String getLotteryHistory() throws Exception {
		return Files.readAllLines(Path.of("src/day24/lottery.txt")).toString().replaceAll("\t", " ");
	}

}
