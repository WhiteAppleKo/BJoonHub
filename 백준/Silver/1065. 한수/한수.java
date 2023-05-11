import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		if(N < 100) {
			count = N;
		}else {
			count = 99;
			count += d(N);
		}
		System.out.print(count);
		
	}
 
	public static int d(int num) {
		int c = 0;
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; 
				int ten = (i / 10) % 10;
				int one = i % 10;
 				if ((hun - ten) == (ten - one)) { 
					c++;
				}
		}
			return c;
			}
}