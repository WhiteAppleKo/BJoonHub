import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int i, j, k;
	public static void main(String[] args) throws IOException {
		String N = br.readLine();
		int Num = Integer.parseInt(N);
		int answer = BruteForceSearch(N, Num);
		bw.write(String.valueOf(answer));
		bw.close();
	}
	static int BruteForceSearch(String N, int Num) {
		for(i = Num - (N.length() * 9); i < Num; i++) {
			int number = i;
			int sum = 0;
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			if( sum + i == Num) {
				return i;
			}
		}
	return 0;
	}
}