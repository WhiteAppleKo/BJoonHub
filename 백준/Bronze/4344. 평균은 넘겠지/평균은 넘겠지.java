import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int N; //학생의 수
		int K = 0; //시험 점수
		int i, j;
		double av;
		double cnt = 0;
		int re;
		for(i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			double arr[] = new double[N];
			for(j = 0; j < N; j++) {
				re = Integer.parseInt(st.nextToken());
				arr[j] = re;
				K += re;
			}
			
			av = K / N;
			for(j = 0; j < N; j++) {
				if(arr[j] > av)
					cnt ++;
			}
			System.out.printf("%.3f%%\n",(cnt/N)*100);
			av = 0;
			K = 0;
			cnt = 0;
		}
	}
}