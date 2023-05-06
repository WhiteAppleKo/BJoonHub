import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		HashSet<String> Set = new HashSet<>();
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			if(str1.equals("ChongChong")) {
				Set.add(str1);
				Set.add(str2);
				break;
			}
			if(str2.equals("ChongChong")) {
				Set.add(str2);
				Set.add(str1);
				break;
			}
		}
		while(T-- >0) {
			st = new StringTokenizer(br.readLine(), " ");
			String str1 = st.nextToken();
			String str2 = st.nextToken();
			if(Set.contains(str1) || Set.contains(str2)) {
				Set.add(str2);
				Set.add(str1);
			}
		}
		System.out.println(Set.size());
	}
}