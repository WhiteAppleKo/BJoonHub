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
	static int i, j, k;
	static int [][] arr;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		arr = new int [T][2];
		sb = new StringBuilder();
		for(i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		for(i = 0; i < T; i++) {
			k = 1;
			for(j = 0; j < T; j++) {
				if( i == j )
					continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					k++;
				}
			}
			sb.append(k + " ");
		}
		bw.write(String.valueOf(sb));
		bw.close();
	}
}