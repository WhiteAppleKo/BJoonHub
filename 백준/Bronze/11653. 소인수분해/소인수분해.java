import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(br.readLine());
		for(int i = 2; i <= Math.sqrt(A); i++) {
				while(A % i == 0) {
					sb.append(i).append('\n');
					A /= i;
				}
			}
		if(A != 1)
			sb.append(A);
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		}
}