import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int R = 0;
		String S;
		for(int i = 0 ; i < T ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					sb.append(S.charAt(j));
				}
			}
			System.out.println(sb);
		}
	}
}