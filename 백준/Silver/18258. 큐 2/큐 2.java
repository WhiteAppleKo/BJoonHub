import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static StringTokenizer st;
	public static Deque<Integer> Deque;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		String str;
		Deque = new LinkedList<>();
		sb = new StringBuilder();
		Integer n;
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			str = st.nextToken();
			switch(str) {
			
			case "push" : 
				Deque.offer(Integer.parseInt(st.nextToken()));
				break;
			
			case "pop" :
				n = Deque.poll();
				if(n == null) {
					sb.append(-1).append("\n");
				}else
					sb.append(n).append("\n");
				break;
				
			case "size" :
				sb.append(Deque.size()).append("\n");
				break;
				
			case "empty" :
				if(Deque.isEmpty()) {
					sb.append(1).append("\n");
				}else
					sb.append(0).append("\n");
				break;
				
			case "front" :
				n = Deque.peek();
				if(n == null) {
					sb.append(-1).append("\n");
				}else
					sb.append(n).append("\n");
				break;
				
			case "back" :
				n = Deque.peekLast();
				if(n == null) {
					sb.append(-1).append("\n");
				}else
					sb.append(n).append("\n");
				break;
				
			}
		}
		System.out.println(sb);
	}
}