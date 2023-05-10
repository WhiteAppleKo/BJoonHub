import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int yesno;
	public static StringBuilder sb;

	private static void open() {
		yesno++;
	}

	private static void close() {
		yesno--;
	}

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		sb = new StringBuilder();
		int j = 0;
		while (j < N) {
			String str = br.readLine();
			yesno = 0;
			int i = 0;
			for (i = 0; i < str.length(); i++) {
				switch (str.charAt(i)) {
				case '(':
					open();
					break;
				case ')':
					close();
					if (yesno < 0) {
						arr[j] = "NO";
					}
					break;
				}
			}
			if (arr[j] == null && yesno == 0) {
				arr[j] = "YES";
			} else
				arr[j] = "NO";
			j++;
		}
		for (String str : arr) {
			sb.append(str).append("\n");
		}
		System.out.println(sb);
	}
}
