import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	static class word {
		int cnt;
		String word;

		word(String word, int cnt) {
			this.cnt = cnt;
			this.word = word;
		}
	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> map = new HashMap<>();
		List<word> word = new ArrayList<>();
		while (T-- > 0) {
			String str = br.readLine();
			if (str.length() < M)
				continue;
			Integer count = map.getOrDefault(str, 0);
			map.put(str, count + 1);
		}
		for (String str : map.keySet()) {
			word.add(new word(str, map.get(str)));
		}
		Collections.sort(word, (w1, w2) -> {
			if (w1.cnt == w2.cnt) {
				if (w1.word.length() == w2.word.length()) {
					return w1.word.compareTo(w2.word);
				} else {
					return w2.word.length() - w1.word.length();
				}
			} else {
				return w2.cnt - w1.cnt;
			}
		});
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.size(); i++)
			sb.append(word.get(i).word).append("\n");
		System.out.println(sb);
	}
}