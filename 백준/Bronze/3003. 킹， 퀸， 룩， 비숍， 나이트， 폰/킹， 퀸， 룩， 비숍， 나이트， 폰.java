import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer N[] = new Integer[6];
		int Full[] = {1, 1, 2, 2, 2, 8};
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 6; i++) {
			N[i] = Integer.parseInt(st.nextToken());
			System.out.print(Full[i] - N[i] + " ");
		}
	}
}