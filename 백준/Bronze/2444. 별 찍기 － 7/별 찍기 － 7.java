import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int space = N - 1;
		int star = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star += 2;
		}
		space += 2;
		star -= 4;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star -= 2;
		}
	}
}