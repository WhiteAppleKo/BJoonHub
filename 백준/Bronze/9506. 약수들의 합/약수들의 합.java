import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == -1)
				break;

			int j = 0;
			int sum = 0;
			int arr[] = new int[N];
			for (int i = 1; i < N; i++) {
				if (N % i == 0) {
					arr[j++] = i;
					sum += i;
				}
			}
			if (sum != N) {
				System.out.println(N + " is NOT perfect.");
				continue;
			}

			System.out.print(N + " = ");
			for (int i = 0; i < j; i++) {
				if (i == j - 1)
					System.out.print(arr[i]);
				else
					System.out.print(arr[i] + " + ");
			}
			System.out.println();
		}

	}
}