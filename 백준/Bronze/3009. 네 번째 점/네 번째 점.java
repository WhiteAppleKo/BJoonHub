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
		st = new StringTokenizer(br.readLine(), " ");
		int ax = Integer.parseInt(st.nextToken());
		int ay = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int bx = Integer.parseInt(st.nextToken());
		int by = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int cx = Integer.parseInt(st.nextToken());
		int cy = Integer.parseInt(st.nextToken());
		
		int A, B;
		A = (ax == bx) ? cx : (ax == cx) ? bx : ax;
		sb.append(A).append(" ");
		B = (ay == by) ? cy : (ay == cy) ? by : ay;
		sb.append(B).append(" ");
		
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
}