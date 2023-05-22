import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	public static void main(String[] args) throws IOException{
 		int N = Integer.parseInt(br.readLine());
 		int ND = N;
 		int U = 0;
 		int D = 0;
 		int i;
 		int Count = 1;
 		while(ND > 0) {
 			ND -= Count;
 			Count++;
 		}
 		ND = 1;
 		int cnt = 0;
 		for(i = 0; i < Count - 2; i++)
 			cnt += ND + i;
 		N -= cnt;
 		
 		if(Count % 2 == 1) {
 			U = 1;
 			D = Count - 1;
 			N--;
 			while(N > 0) {
 				U++;
 				D--;
 				N--;
 			}
 		}
 		if(Count % 2 == 0) {
 			U = Count - 1;
 			D = 1;
 			N--;
 			while(N > 0) {
 				U--;
 				D++;
 				N--;
 			}
 		}
 		System.out.println(U+"/"+D);
 	}
}