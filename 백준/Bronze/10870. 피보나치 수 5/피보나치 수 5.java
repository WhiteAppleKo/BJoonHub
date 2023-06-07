import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		int N = Integer.parseInt(br.readLine());
		int i = 1;
		int A = 0;
		int B = 1;
		int C = 0;
		while(true) {
			if ( N == 0) {
				bw.write(String.valueOf(0));
				bw.close();
				break;
			}
			if ( N == 1) {
				bw.write(String.valueOf(1));
				bw.close();
				break;
			}
				
			C = A + B;
			i++;
			if(i == N) {
				bw.write(String.valueOf(C));
				bw.close();
				break;
			}
			A = B + C;
			i++;
			if(i == N) {
				bw.write(String.valueOf(A));
				bw.close();
				break;
			}
			B = C + A;
			i++;
			if(i == N) {
				bw.write(String.valueOf(B));
				bw.close();
				break;
			}
	}
}
}