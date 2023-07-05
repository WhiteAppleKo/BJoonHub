import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		long c = Long.parseLong(st.nextToken());
		long d = Long.parseLong(st.nextToken());
		long x = (a * d) + (c * b);
		long y = b * d;
		while(true) {
			long calc = gcd(x, y);
			if (calc != 1) {
				x /= calc;
				y /= calc;
			}else break;
			
		}
		System.out.println(x + " " + y);
	}

	public static Long gcd(Long a, Long b) {

		while (b != 0) {
			Long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}