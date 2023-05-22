import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int N = Kg(Integer.parseInt(br.readLine())); 
		System.out.println(N);
	}
	public static int Kg(int N){
		int k = 0;
		if (N == 4 || N == 7)
			return -1;
		if (N % 5 == 1) {
			k = (N - 6) / 5 + 2;
			return (k);
			}else
		if (N % 5 == 2) {
			k = (N - 12) / 5 + 4;
			return (k);
			}else
		if (N % 5 == 3) {
			k = N / 5 + 1;
			return (k);
			}else
		if (N % 5 == 4) {
			k = (N - 9) / 5 + 3;
			return (k);
			}else
		if (N % 5 == 0) {
			k = N / 5;
			return (k);
			}
		return k;
	}
}