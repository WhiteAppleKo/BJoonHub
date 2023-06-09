import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int Num = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(Count(Num)));
		bw.close();
	}
	public static int Count(int Num) {
		int count = 1;
		int N = 666;
		while(count != Num) {
			N++;
			if(String.valueOf(N).contains("666")) {
				count++;
			}
		}
		return N;
	}
}