import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int T1 = Integer.parseInt(st.nextToken());
		int T2 = Integer.parseInt(st.nextToken());
		int cnt = 0;
		Set<Integer> HashSet1 = new HashSet<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < T1; i++) {
			int n = Integer.parseInt(st.nextToken());
			HashSet1.add(n);
		}
		Set<Integer> HashSet2 = new HashSet<>();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < T2; i++) {
			int n = Integer.parseInt(st.nextToken());
			HashSet2.add(n);
		}
		 for(int num : HashSet1) {
	            if(HashSet2.contains(num)) {
	                cnt ++;
	            }
	        }
		System.out.println(T1 + T2 - (cnt * 2));
	}
}