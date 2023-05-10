import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int i, j;
		double A = 0.0;
		int M = -1;
		int T = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(i = 0; i < T; i++) {
			j = Integer.parseInt(st.nextToken());
			if(M < j)
				M = j;
			A += j;
		}
		System.out.println(A / M * 100 / T);
	}
}