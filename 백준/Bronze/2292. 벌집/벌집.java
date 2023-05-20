import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	public static void main(String[] args) throws IOException{
 		System.out.println(check());
  	}
 	public static int check() throws IOException {
 		int A = Integer.parseInt(br.readLine());
 		int Count = 1 ;
 		while(A > 0) {
 			if( A == 1 ) {
 				return Count;
 				}else {
 					A -= 6*Count;
 					Count++;
 				}
 		}
 		return Count;
 	}
}