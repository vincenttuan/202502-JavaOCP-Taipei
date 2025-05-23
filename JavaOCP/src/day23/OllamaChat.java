package day23;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OllamaChat {

	public static void main(String[] args) throws Exception {
		String path = "http://localhost:11434/api/chat";
		String model = "qwen2.5:0.5b";
		String prompt = "你是誰";
		String input = "{"
				+ "  \"model\": \"%s\", "
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
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String result = response.body();
		System.out.println(result);
		
	}

}
