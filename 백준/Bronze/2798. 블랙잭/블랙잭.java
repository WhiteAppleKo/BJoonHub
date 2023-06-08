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
	static int [] arr;
	static int i, j, k;
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		arr = new int [N];
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int answer = BruteForceSearch(arr, N, M);
		bw.write(String.valueOf(answer));
		bw.close();
	}
	static int BruteForceSearch(int []arr, int N, int M) {
		int answer = 0;
		for(i = 0; i < N - 2; i++) {
			for(j = i + 1; j < N - 1; j++) {
				for(k = j + 1; k < N; k++) {
					int Calc = arr[i] + arr[j] + arr[k];
					
					if(Calc == M)
						return Calc;
					if(answer < Calc && Calc < M)
						answer = Calc;
				}
			}
		}
		return answer;
	}
}