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
		int r = Integer.parseInt(br.readLine());
		sb.append(Math.pow(r, 2) *  Math.PI).append('\n');
		sb.append((int)Math.pow(r, 2) * 2).append('\n');
		bw.write(String.valueOf(sb));
		bw.flush();
		bw.close();
	}
}