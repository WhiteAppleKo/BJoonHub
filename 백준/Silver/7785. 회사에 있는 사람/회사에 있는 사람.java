import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			map.put(st.nextToken(), st.nextToken());
		}
		List<String> keyList = new ArrayList<>(map.keySet());
		Collections.sort(keyList, Collections.reverseOrder());
		for (String key : keyList) {
			if (map.get(key).equals("enter")) {
				System.out.println(key);
			}
		}
	}
}