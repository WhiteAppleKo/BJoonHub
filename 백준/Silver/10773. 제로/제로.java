import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		stack = new int[N];
		int T;
		int ans = 0;
		while (N-- > 0) {
			T = Integer.parseInt(br.readLine());
			if (T == 0) {
				size--;
				stack[size] = 0;

			} else {
				stack[size] = T;
				size++;
			}
		}
		for (int cnt : stack) {
			ans += cnt;
		}
		System.out.println(ans);
	}
}