import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());
		System.out.println(str.charAt(N - 1));
	}
}