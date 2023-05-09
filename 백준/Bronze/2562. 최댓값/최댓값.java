import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		int i, max, index;
		int count = 1;
		for(i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		max = arr[0];
		index = 1;
		for(i = 1; i < 9; i++) {
			count++;
			if(arr[i] > max) {
				max = arr[i];
				index = count;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}