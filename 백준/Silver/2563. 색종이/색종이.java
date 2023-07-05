import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	
    
	public static int ChSquare(int T) throws IOException {
		int cnt = 0;
		boolean BlackSquare [][] = new boolean [100][100];
		for(int N = 0; N < T; N++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for(int i = x; i < x + 10; i++) {
				for(int j = y; j < y + 10; j++) {
					if(!BlackSquare [i][j]) {
						BlackSquare [i][j] = true;
						cnt ++;
					}
				}
			}
		}
		return cnt;
	}
	
	
	
	public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int cnt = ChSquare(T);
        System.out.println(cnt);
    }
}