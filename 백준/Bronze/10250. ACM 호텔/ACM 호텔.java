import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	public static void main(String[] args) throws IOException {
 		StringTokenizer st;
 		StringBuilder sb = new StringBuilder();
 		int T = Integer.parseInt(br.readLine());
 		int H, W, N;
 		for(int i = 0; i < T; i++) {
 			st = new StringTokenizer(br.readLine(), " ");
 			H = Integer.parseInt(st.nextToken());
 			W = Integer.parseInt(st.nextToken());
 			N = Integer.parseInt(st.nextToken());
 			
 			if (N % H == 0) {
				sb.append((H * 100) + (N / H)).append('\n');
 
			} else {
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
				}
 		} 	
 		System.out.println(sb);
 	}
}