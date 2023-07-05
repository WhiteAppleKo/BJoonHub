import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static String[] stringarr(int T) throws IOException {
		String arr[] = new String[T];
		for (int i = 0; i < T; i++) {
			arr[i] = br.readLine();
		}
		return arr;
	}

	public static int compare(String arr[], int N) throws IOException {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			String teststring = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].compareTo(teststring) == 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int T = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		String arr[] = stringarr(T);
		int cnt = compare(arr, N);

		System.out.println(cnt);
	}
}