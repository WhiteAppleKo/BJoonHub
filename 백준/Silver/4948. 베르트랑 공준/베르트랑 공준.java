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
		while(true) {
			int A = Integer.parseInt(br.readLine());
			if(A != 0) {
				int Count = 0;
				for(int i = A + 1; i <= A * 2; i++) {
					if(Calc(i)) {
						Count ++;
						}
					}
				sb.append(Count).append('\n');
				}else break;
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