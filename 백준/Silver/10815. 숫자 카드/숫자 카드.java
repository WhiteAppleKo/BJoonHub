import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static StringBuilder sb = new StringBuilder();

	public static int[] TakeNumber(int N) throws IOException {
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		return arr;
	}

	public static boolean BinarySearch(int arr[], int TargetNumber) {
		int left = 0;
		int right = arr.length - 1;
		int mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] < TargetNumber)
				left = mid + 1;
			else if (arr[mid] > TargetNumber)
				right = mid - 1;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int arr[] = TakeNumber(N);
		Arrays.sort(arr);

		int T = Integer.parseInt(br.readLine());
		int testarr[] = TakeNumber(T);
		for (int i = 0; i < testarr.length; i++) {
			if (BinarySearch(arr, testarr[i])) {
				sb.append("1").append(" ");
			} else
				sb.append("0").append(" ");
		}
		System.out.println(sb);
	}
}