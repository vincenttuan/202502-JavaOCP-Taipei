package day23;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

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
		
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(path))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(input))
				.build();
		
	}

}
