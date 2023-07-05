import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int arr[] = new int[N];
		int srt[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = srt[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(srt);
		
		Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int n : srt)
            if (!map.containsKey(n))
                map.put(n, idx++);
        
        for (int n : arr)
            sb.append(map.get(n)).append(' ');

        System.out.println(sb.toString());
	}
}