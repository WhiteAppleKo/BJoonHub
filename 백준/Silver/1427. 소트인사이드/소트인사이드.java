import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String T = br.readLine();
		int N = Integer.parseInt(T);
		int Cnt = 0;
		
		while(N > 0) {
			N /= 10;
			Cnt ++;
		}
		Integer [] arr = new Integer[Cnt]; // int로 배열 선언을 했더니 sort 부분에서 오류 발생 Integer로 고쳐주니 해결
		for(int i = 0; i < Cnt; i++) {
			arr[i] = T.charAt(i) - 48;
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i = 0; i < Cnt; i++) {
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}