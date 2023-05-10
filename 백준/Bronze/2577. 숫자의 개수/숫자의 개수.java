import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		String C = br.readLine();
		int arr[] = new int[10];
		int cal = Integer.parseInt(A) * Integer.parseInt(B) * Integer.parseInt(C);
		String count = Integer.toString(cal);
		int len = count.length();
		int i, j;
		for(i = 0; i < 10; i++)
			arr[i] = 0;
		
		for(i = 0; i < len; i++) {
			for(j = 0; j < 10; j++) {
				if(j == count.charAt(i) - '0') {
					arr[j]++;
				}
			}
		}
		for(i = 0; i < 10; i++)
			System.out.println(arr[i]);
	}
}