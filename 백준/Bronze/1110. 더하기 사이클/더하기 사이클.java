import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Copy = N;
		int Count = 0;
		
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			Count++;
		}while(Copy != N);
		System.out.println(Count);
	}
}