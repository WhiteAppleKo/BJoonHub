import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class Main {
	static String[][] arr;
	static int i, j;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new String[N][N];
		Calc(0, 0, N, false);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		bw.write(String.valueOf(sb));
		bw.close();
	}
	public static void Calc(int x, int y, int N, boolean blank) {
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = " ";
				}
			}
			return;
		}
		
		if (N == 1) {
			arr[x][y] = "*";
			return;
		}
		
		int size = N / 3; //3 1
		int count = 0;
		for (int i = x; i < x + N; i += size) {// 0 9
			for (int j = y; j < y + N; j += size) { // 1
				count++;//4
				if (count == 5) { // 공백 칸
					Calc(i, j, size, true); // 0 5 3 t
				}else {
					Calc(i, j, size, false);// 0 4 3 f
				}
		}
	}
	}
}