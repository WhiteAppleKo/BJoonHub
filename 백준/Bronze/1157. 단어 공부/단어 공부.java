import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[26];
		String S = br.readLine();
		int len = S.length();
		for(int i = 0; i < len; i++) { // A,a 모두 같이 대,소문자 구별 없이 카운트 하기위한 반복문
			if('a' <= S.charAt(i) && S.charAt(i) <= 'z') { 
				arr[S.charAt(i) - 'a']++;
			}else {
				arr[S.charAt(i) - 'A']++;
			}
		}
		int max = -1;
		char ch = '?';
		for(int i = 0; i < 26; i++) { // max에 가장 많이 카운트된 알파벳이 몇 번째 알파벳인지 들어간다
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+'A'); // i번째 대문자를 ch에 저장
			}
			else if (arr[i] == max) {
				ch ='?';
			}
		}
		System.out.println(ch);
	}
}