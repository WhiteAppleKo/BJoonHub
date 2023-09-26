import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static Stack<Integer> stack1 = new Stack<>();
	public static Stack<Integer> stack2 = new Stack<>();
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static int snack = 1;

	public static void main(String[] args) throws IOException {

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < T; i++) {
			stack2.push(Integer.parseInt(st.nextToken()));
		}
		while (!stack2.empty()) {
			stack1.push(stack2.pop());
		}

		while (!stack1.empty()) {
			if (snack == stack1.peek()) {
				snack++;
				stack1.pop();
			} else if (!stack2.empty() && stack2.peek() == snack) {
				snack++;
				stack2.pop();
			}else {
				stack2.push(stack1.pop());
			}
		}
		while (!stack2.empty()) {
			if (snack == stack2.peek()) {
				snack++;
				stack2.pop();
			} else {
				System.out.println("Sad");
				break;
			}
		}
		if (snack == T + 1)
			System.out.println("Nice");
	}
}