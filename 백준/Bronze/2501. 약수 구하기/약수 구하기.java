import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int firstnum = Integer.parseInt(st.nextToken());
		int secondnum = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= firstnum; i++) {
			if (firstnum % i == 0) {
				secondnum--;
			}
			if (secondnum == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}