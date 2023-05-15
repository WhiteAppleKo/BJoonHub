import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		int n = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		while(a > 0) {
			n = n * 10;
			n += a % 10;
			a /= 10;
		}
		a = n;
		n = 0;
		while(b > 0) {
			n = n * 10;
			n += b % 10;
			b /= 10;
		}
		b = n;
		if (a > b)
			System.out.println(a);
		if (b > a)
			System.out.println(b);
	}
}