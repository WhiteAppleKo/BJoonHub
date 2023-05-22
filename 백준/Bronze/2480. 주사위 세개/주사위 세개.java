import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if (a == b && a == c && b == c) {
			System.out.print(10000 + (a * 1000));
		} else if (a == b || a == c) {
			System.out.print(1000 + (a * 100));
		} else if (b == c) {
			System.out.print(1000 + (b * 100));
		} else {
			System.out.print((Math.max(a, Math.max(b, c)) * 100));
		}
	}
}