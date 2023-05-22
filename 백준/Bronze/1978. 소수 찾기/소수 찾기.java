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
		int N = Integer.parseInt(br.readLine());
		int tn;
		int Count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			tn = Integer.parseInt(st.nextToken());
			if(Calc(tn)) {
				Count++;
				}
			}
		bw.write(String.valueOf(Count));
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