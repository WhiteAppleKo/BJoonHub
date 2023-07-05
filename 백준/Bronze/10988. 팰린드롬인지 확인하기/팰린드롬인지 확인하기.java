import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int compare(String str, int N) {
		for (int i = 0; i < N; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		int N = str.length() / 2;
		int result = compare(str, N);
		System.out.println(result);
	}
}