import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		int Count = 0;
		int min = 0;
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		for(int i = A; i <= B; i++) {
			if(Calc(i)) {
				Count += i;
				if(min == 0) {
					min = i;
					}
				}
			}
		if(Count == 0) {
			min = -1;
		}else {
		bw.write(String.valueOf(Count)+"\n");
		}
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
		}
	static public boolean Calc(int tn) {
		int j;
		if(tn == 1)
			return false;
		for(j = 2; j <= Math.sqrt(tn); j++) {
			if(tn % j == 0) {
				return false;
			}
		}
		return true;
	}
}