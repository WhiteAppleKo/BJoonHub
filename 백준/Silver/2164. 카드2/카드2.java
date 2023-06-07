import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
 
public class Main {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static Deque<Integer> Deque;
	
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		Deque = new LinkedList<>();
		Integer n;
		for(int i = 1; i <= T; i++) {
			Deque.offer(i);
		}
		while(Deque.peekLast() != Deque.peekFirst()) {
			Deque.poll();
			n = Deque.poll();
			Deque.offerLast(n);
		}
		System.out.println(Deque.peek());
	}
}