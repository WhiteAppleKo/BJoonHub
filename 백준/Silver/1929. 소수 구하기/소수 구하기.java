import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i = A; i <= B; i++) {
			if(Calc(i)) {
				sb.append(i).append('\n');
				}
			}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
		}
	static public boolean Calc(int tn) {
		int j;
		if(tn == 1)
			return false;
		for(j = 2; j <= Math.sqrt(tn); j++) {
			if(tn % j == 0) {
				return false;
			}
		}
		return true;
	}
}