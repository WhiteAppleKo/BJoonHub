import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = -1;
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(arr[ch - 'a'] == -1) {	// 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
				}
			}
		for(int val : arr) {	// 처음 알게된 방법인데 이렇게 하면 자동으로 배열의 길이 만큼 순차적으로 반복 한다고 한다.
			System.out.print(val + " ");
		}
	}
}