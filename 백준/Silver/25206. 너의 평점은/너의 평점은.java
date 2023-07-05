import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static HashMap<String, Double> map = new HashMap<>() {
		{
			put("A+", 4.5);
			put("A0", 4.0);
			put("B+", 3.5);
			put("B0", 3.0);
			put("C+", 2.5);
			put("C0", 2.0);
			put("D+", 1.5);
			put("D0", 1.0);
			put("F", 0.0);
		}
	};

	public static void main(String[] args) throws IOException {
		Double result = 0.0;
		Double N = 0.0;
		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			Double x = Double.parseDouble(st.nextToken());
			String str2 = st.nextToken();

			if (!str2.equals("P")) {
				Double y = map.get(str2);
				N += x;
				result += x * y;
			}
		}
		System.out.println(result / N);
	}
}