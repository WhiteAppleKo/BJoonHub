import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		int min;
		int k = 0;
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[T];
		for(int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}	
		Arrays.sort(arr);
		// Collections.sotr(arr);
		// Collections.reverse(arr);
		
		for(int i = 0; i < T; i++) {
			sb.append(arr[i]).append("\n");
		}
		bw.write(String.valueOf(sb));
		bw.close();
	}
}