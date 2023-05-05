import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		int cnt = 0;
		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			if (str.equals("ENTER")) {
				map.clear();
				cnt--;
			}
			if (map.get(str) == null) {
				cnt++;
				map.put(str, 1);
			} else {
				map.put(str, 0);
			}
		}
		System.out.println(cnt);
	}
}