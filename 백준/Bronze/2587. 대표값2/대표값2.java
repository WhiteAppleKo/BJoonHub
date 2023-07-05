import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;

	public static int[] TakeNum() throws IOException {
		int arr[] = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		return arr;
	}

	public static int Average(int arr[]) {
		int Average = 0;
		for (int i = 0; i < arr.length; i++) {
			Average += arr[i];
		}
		return Average / arr.length;
	}

	public static void main(String[] args) throws IOException {
		int arr[] = TakeNum();
		int average = Average(arr);
		Arrays.sort(arr);
		System.out.println(average);
		System.out.println(arr[2]);
	}
}