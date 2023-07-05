import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int arr[] = new int[3];
		while (true) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(arr);
			int cnt = 0;
			if(arr[0]== 0) break;
			
			if (arr[0] + arr[1] > arr[2]) {
				if (arr[0] == arr[1])
					cnt++;
				if (arr[1] == arr[2])
					cnt++;
				if (arr[0] == arr[2])
					cnt++;
				switch (cnt) {
				case 0:
					System.out.println("Scalene");
					break;
				case 1:
					System.out.println("Isosceles");
					break;
				case 3:
					System.out.println("Equilateral");
					break;
				}
			} else
				System.out.println("Invalid");
			
		}
	}
}