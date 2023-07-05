import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int gcd(int a, int b) {

		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int Min = 0;
		int gcd = 0;
		int arr [] = new int [N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < N - 1; i++) {
			int dist = arr[i + 1] - arr[i];
			gcd = gcd(dist, gcd);
		}
		System.out.println((arr[N - 1] - arr[0]) / gcd + 1 - arr.length);
	}
}