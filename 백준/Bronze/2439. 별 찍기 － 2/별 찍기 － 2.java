import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int j = 0;
		int p;
		int Num = Integer.parseInt(br.readLine());
		for(int i = 1; i < Num + 1; i++) {
			p = Num;
			while(i < p) {
				System.out.print(" ");
				p--;
			}
			while(j < i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			j = 0;
		}
	}
}