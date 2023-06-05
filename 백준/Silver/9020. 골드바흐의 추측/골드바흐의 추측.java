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
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int x = 0;
			int TN = Integer.parseInt(br.readLine()) / 2;
			while(true) {
				if(Calc(TN + x) && Calc(TN - x))
					break;
				x++;
			}
			sb.append((TN - x) +" "+(TN + x)).append('\n');
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