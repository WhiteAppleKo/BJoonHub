import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;
	private static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		double calc = Math.pow(2, N);
		int ans = (int)calc;
		System.out.println(ans);
    }
}