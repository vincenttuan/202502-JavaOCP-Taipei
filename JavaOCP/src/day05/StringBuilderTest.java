package day05;

public class StringBuilderTest {

	public static void main(String[] args) {
		// 連續字串 StringBuilder, 因為會共用記憶體位置所以 sb = 可以不用寫
		StringBuilder sb = new StringBuilder("Java");
		//sb = sb.append("Web").append("OCP").append("11");
		sb.append("Web").append("OCP").append("11");
		System.out.println(sb);

	}

}
