import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		Map<String, Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine(), " ");
		sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
			if (map.get(name) == 2) {
				list.add(name);
				cnt++;
			}
		}
		 Collections.sort(list);
	        for (String s : list) {
	            sb.append(s + "\n");
	        }
		System.out.println(cnt);
		System.out.println(sb);
	}
}