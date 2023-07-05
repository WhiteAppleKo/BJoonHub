import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		int arr [] = new int [4];
		arr[0] = 25;
		arr[1] = 10;
		arr[2] = 5;
		arr[3] = 1;
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb = new StringBuilder();
			for(int j = 0; j < 4; j++) {
				int calc = N / arr[j];
				N %= arr[j];
				sb.append(calc).append(" ");
				}
			System.out.println(sb);
		}
    }
}