import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N + 1];
		for (int i = 1; i < N + 1; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z;
			z = arr[x];
			arr[x] = arr[y];
			arr[y] = z;
		}
		for (int i = 1; i < N + 1; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb);
	}
}