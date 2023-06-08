import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	static int i, j;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int N = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, N) - 1)).append('\n');
		Calc(N, 1, 2, 3);
		bw.write(String.valueOf(sb));
		bw.close();
	}
	public static void Calc(int N, int x, int y, int z) {
		if(N == 1) {
			sb.append(x + " " + z + "\n");
			return;
		}
		Calc(N - 1, x, z, y);
		
		sb.append(x + " " + z + "\n");
		
		Calc(N-1, y, x, z);
	}
}