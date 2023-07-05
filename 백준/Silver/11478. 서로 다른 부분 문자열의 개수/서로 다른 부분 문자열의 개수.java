import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String str = br.readLine();
		Set <String> Set = new HashSet<>();
		String str2;
		for(int i = 0; i < str.length(); i++) {
			str2 = "";
			
			for(int j = i; j < str.length(); j++) {
				str2 += str.substring(j, j + 1);
				Set.add(str2);
			}
		}
		System.out.println(Set.size());
	}
}