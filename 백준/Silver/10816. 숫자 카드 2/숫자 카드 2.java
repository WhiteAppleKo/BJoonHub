import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static HashMap HaveNumberCard(int N) throws IOException {
		HashMap<Integer, Integer> NumberCardMap = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken());

			if (!NumberCardMap.containsKey(x)) {
				NumberCardMap.put(x, 1);
			} else {
				NumberCardMap.put(x, NumberCardMap.get(x) + 1);
			}
		}
		return NumberCardMap;
	}

	public static StringBuilder Compare(HashMap NumberCardMap, int M) throws IOException {
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < M; i++) {
			int y = Integer.parseInt(st.nextToken());
			if (NumberCardMap.containsKey(y)) {
				sb.append(NumberCardMap.get(y)).append(" ");
			} else {
				sb.append("0").append(" ");
			}
		}
		return sb;
	}

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> NumberCardMap = HaveNumberCard(N);
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = Compare(NumberCardMap, M);
		System.out.println(sb);

	}
}