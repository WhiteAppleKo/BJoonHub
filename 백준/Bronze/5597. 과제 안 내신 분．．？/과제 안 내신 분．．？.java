import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int arr[] = new int [31];
		int k;
		for(int i = 0; i < 28; i++) {
			k = Integer.parseInt(br.readLine());
			arr[k] = k;
		}
		k = 0;
		for(int i = 1; i < 31; i++) {
			if(arr[i] == 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}
}
