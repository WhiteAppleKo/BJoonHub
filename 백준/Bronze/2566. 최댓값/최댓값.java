import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static private int i = 1;
	static private int j = 1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int arr[][] = new int[10][10];
		int max = 0;
		for (i = 1; i < 10; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (j = 1; j < 10; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] >= max) {
					max = arr[i][j];
				}
			}
		}
		i = 1;
		j = 1;
		while (max != arr[i][j]) {
			if(j < 9) {
				j++;
			}
			else {
				i++;
				j = 1;
			}
		};
		System.out.println(max);
		System.out.print(i+" "+j);
	}
}