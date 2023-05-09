import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int A = Integer.parseInt(st.nextToken());
			if(A > max) {
				max = A;
			}
			if (A < min)
				min = A;
		}
		System.out.println(min + " " + max);
	}
}