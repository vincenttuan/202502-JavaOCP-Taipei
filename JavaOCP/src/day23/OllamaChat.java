package day23;

public class OllamaChat {

	public static void main(String[] args) {
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

	}

}
