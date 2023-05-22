import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 	public static void main(String[] args) throws IOException{
 		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 		int Up = Integer.parseInt(st.nextToken());
 		int Down = Integer.parseInt(st.nextToken());
 		int High = Integer.parseInt(st.nextToken());
 		int day = (High - Down) / (Up - Down);
 		if((High - Down) % (Up - Down) != 0)
 			day++;
 		System.out.println(day);
 	}
}