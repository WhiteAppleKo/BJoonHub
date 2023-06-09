import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int k = 0;
	public static int recursion (String st, int l, int r){
		k ++;
		if( l >= r) return 1;
		else if(st.charAt(l) != st.charAt(r)) return 0;
		else return recursion(st, l + 1, r - 1);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str[] = new String[N];
		
		for(int i = 0; i < N; i++) {
			str[i] = br.readLine();
		}
		for(int i = 0; i < N; i++) {
			System.out.print(recursion(str[i], 0,  str[i].length() - 1) +" ");
			System.out.println(k);
			k = 0;
		}
	}
}