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
		sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			if(A == 0 && B == 0 & C == 0)
				break;
			if(Calc(A, B, C)) {
				sb.append("right").append('\n');
			}else sb.append("wrong").append('\n');
		}
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
	public static boolean Calc(int A, int B, int C) {
		int a,b,c;
		if (A > B) {
			if(A > C) {
				c = (int)Math.pow(A , 2);
				a = (int)Math.pow(B , 2);
				b = (int)Math.pow(C , 2);
			}else {
				c = (int)Math.pow(C , 2);
				a = (int)Math.pow(A , 2);
				b = (int)Math.pow(B , 2);
			}
		}else if(B > C) {
			c = (int)Math.pow(B , 2);
			a = (int)Math.pow(A , 2);
			b = (int)Math.pow(C , 2);
		}else {
			c = (int)Math.pow(C , 2);
			a = (int)Math.pow(A , 2);
			b = (int)Math.pow(B , 2);
		}
		if((a + b) == c )
			return true;
		return false;
	}
}